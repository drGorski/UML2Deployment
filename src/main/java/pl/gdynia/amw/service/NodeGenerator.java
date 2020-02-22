package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import pl.gdynia.amw.consts.Consts;
import pl.gdynia.amw.file.Storage;
import pl.gdynia.amw.model.node.CordaNode;
import pl.gdynia.amw.model.node.NotaryCordaNode;

import java.util.Collection;
import java.util.Map;

import static pl.gdynia.amw.service.TemplateManager.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NodeGenerator {

    private static NodeGenerator INSTANCE = new NodeGenerator();

    public void generateDeployNodesTask(String destination, Collection<CordaNode> cordaNodes) {
        String deployNodesTask = TemplateManager.getInstance().readTemplate(DEPLOY_NODES_TASK_TEMPLATE);
        String singleNode = TemplateManager.getInstance().readTemplate(DEPLOY_NODES_TASK_NODE_TEMPLATE);
        String notarySection = TemplateManager.getInstance().readTemplate(DEPLOY_NODES_TASK_NODE_NOTARY_SECTION_TEMPLATE);

        String nodesStr = StringUtils.EMPTY;
        for (CordaNode cordaNode : cordaNodes) {
            String currentNode = singleNode;
            currentNode = currentNode.replaceAll("<!--notary-->", cordaNode instanceof NotaryCordaNode ? notarySection : "");
            currentNode = populateTemplateWithTags(currentNode, cordaNode.getProperties());
            nodesStr = nodesStr + Consts.NEW_LINE + currentNode;
            generateNodeConfigFiles(destination, cordaNode);
        }

         Storage.getInstance().storeFile(destination, deployNodesTask.replaceAll("<!--nodes-->", nodesStr), "deployNodesTask.gradle");
    }

    public void generateNodeConfigFiles(String destination, CordaNode cordaNode) {
        String nodeConfig = TemplateManager.getInstance().readTemplate(NODE_CONFIG_TEMPLATE);
        nodeConfig = populateTemplateWithTags(nodeConfig, cordaNode.getProperties());
        Storage.getInstance().storeFile(destination, nodeConfig, cordaNode.getName()+".config");
    }

    private String populateTemplateWithTags(String template, Map<String, Object> tagsAndValues) {
        for (Map.Entry<String, Object> entry : tagsAndValues.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String tag = TemplateTags.getInstance().buildTemplateTag(key);
            template = template.replaceAll(tag, getValueAsString(tag, value));
        }

        return template;
    }

    private String getValueAsString(String tag, Object object) {
        if (object == null) {
            return tag;
        }

        return object.toString();


    }

    protected static NodeGenerator getInstance() {
        return INSTANCE;
    }

}
