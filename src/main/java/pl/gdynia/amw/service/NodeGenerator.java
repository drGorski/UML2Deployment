package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import pl.gdynia.amw.consts.Consts;
import pl.gdynia.amw.dictionary.TemplateTagsEnum;
import pl.gdynia.amw.model.Destination;
import pl.gdynia.amw.model.node.CordaNode;
import pl.gdynia.amw.model.node.NotaryCordaNode;

import java.util.Collection;
import java.util.Map;

import static pl.gdynia.amw.consts.Consts.CONFIG_FILE_EXTENSION;
import static pl.gdynia.amw.consts.Consts.GRALDE_RESULT_FILE;
import static pl.gdynia.amw.service.TemplateManager.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NodeGenerator {

    private static NodeGenerator INSTANCE = new NodeGenerator();

    public void generateDeployNodesTask(Destination destination, Collection<CordaNode> cordaNodes) {
        String deployNodesTask = TemplateManager.getInstance().readTemplate(DEPLOY_NODES_TASK_TEMPLATE);

        StringBuilder  nodesStr = new StringBuilder(StringUtils.EMPTY);
        cordaNodes.forEach(cordaNode -> {
            String nodeTemplatePath = (cordaNode instanceof NotaryCordaNode) ? DEPLOY_NODES_TASK_NODE_NOTARY_TEMPLATE : DEPLOY_NODES_TASK_NODE_TEMPLATE;
            String currentNode = populateTemplateWithTags(TemplateManager.getInstance().readTemplate(nodeTemplatePath), cordaNode.getProperties());
            nodesStr.append(Consts.NEW_LINE);
            nodesStr.append(currentNode);
            generateNodeConfigFiles(destination, cordaNode);
        });

        destination.store(deployNodesTask.replaceAll(TemplateTags.getInstance().buildTemplateTag(TemplateTagsEnum.nodes), nodesStr.toString()), GRALDE_RESULT_FILE);
    }

    public void generateNodeConfigFiles(Destination destination, CordaNode cordaNode) {
        String templatePath = (cordaNode instanceof NotaryCordaNode) ? NODE_NOTARY_CONFIG_TEMPLATE : NODE_CONFIG_TEMPLATE;
        String nodeConfig = populateTemplateWithTags(TemplateManager.getInstance().readTemplate(templatePath), cordaNode.getProperties());
        destination.store(nodeConfig, cordaNode.getName() + CONFIG_FILE_EXTENSION);
    }

    private String populateTemplateWithTags(String template, Map<String, Object> tagsAndValues) {
        for (Map.Entry<String, Object> entry : tagsAndValues.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String tag = TemplateTags.getInstance().buildTemplateTag(key);
            template = template.replace(tag, getValueAsString(tag, value));
        }

        return template;
    }

    private String getValueAsString(String tag, Object object) {
        if (object == null) {
            return tag;
        }

        return object.toString().trim();
    }

    protected static NodeGenerator getInstance() {
        return INSTANCE;
    }

}
