package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.gdynia.amw.file.Storage;
import pl.gdynia.amw.model.node.Node;
import pl.gdynia.amw.model.node.NotaryNode;

import java.util.Collection;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NodeGenerator {

    private static NodeGenerator INSTANCE = new NodeGenerator();

    public void generateDeployNodesTask(String destination, Collection<Node> nodes) {
        String deployNodesTask = TemplateManager.getInstance().readTemplate("deployNodesTask.template");
        String singleNode = TemplateManager.getInstance().readTemplate("deployNodesTask_node.template");
        String notarySection = TemplateManager.getInstance().readTemplate("deployNodesTask_nodeNotarySection.template");

        String nodesStr = "";
        for (Node node : nodes) {
            String currentNode = singleNode;
            currentNode = currentNode.replaceAll("<!--notary-->", node instanceof NotaryNode ? notarySection : "");
            currentNode = populateTemplateWithTags(currentNode, node.getProperties());
            nodesStr = nodesStr + "\n" + currentNode;
            generateNodeConfigFiles(destination, node);
        }

         Storage.getInstance().storeFile(destination, deployNodesTask.replaceAll("<!--nodes-->", nodesStr), "deployNodesTask.gradle");
    }

    public void generateNodeConfigFiles(String destination, Node node) {
        String nodeConfig = TemplateManager.getInstance().readTemplate("nodeConfig.template");
        nodeConfig = populateTemplateWithTags(nodeConfig, node.getProperties());
        Storage.getInstance().storeFile(destination, nodeConfig, node.getName()+".config");
    }

    private String populateTemplateWithTags(String template, Map<String, Object> tagsAndValues) {
        for (Map.Entry<String, Object> entry : tagsAndValues.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String tag = getTag(key);
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

    private String getTag(String taggegValueKey) {
        return "<!--" + taggegValueKey + "-->";
    }

    protected static NodeGenerator getInstance() {
        return INSTANCE;
    }

}
