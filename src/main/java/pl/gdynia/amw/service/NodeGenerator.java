package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.gdynia.amw.file.Storage;
import pl.gdynia.amw.model.node.Node;

import java.util.Collection;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NodeGenerator {

    private static NodeGenerator INSTANCE = new NodeGenerator();

    public void generateDeployNodesTask(String destination, Collection<Node> nodes) {
        String deployNodesTask = TemplateManager.getInstance().readTemplate("deployNodesTask.template");
        String singleNode = TemplateManager.getInstance().readTemplate("deployNodesTask_node.template");

        String nodesStr = "";
        for (Node node : nodes) {
            String currentNode = new String(singleNode);
            for (Map.Entry<String, Object> entry : node.getProperties().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String tag = getTag(key);
                currentNode = currentNode.replaceAll(tag, getValueAsString(tag, value));
            }
            nodesStr = nodesStr + "\n" + currentNode;
        }

        Storage.getInstance().storeFile(destination, deployNodesTask.replaceAll("<!--nodes-->", nodesStr), "deployNodesTask.gradle");
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
