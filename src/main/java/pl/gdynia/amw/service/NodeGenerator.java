package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.gdynia.amw.model.node.Node;

import java.util.Collection;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NodeGenerator {

    private static NodeGenerator INSTANCE = new NodeGenerator();

    public String generateDeployNodesTask(Collection<Node> nodes) {
        return "";
    }

    protected static NodeGenerator getInstance() {
        return INSTANCE;
    }

}
