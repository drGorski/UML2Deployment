package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.gdynia.amw.dto.GenerationResult;
import pl.gdynia.amw.model.node.Node;

import java.util.Collection;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CordaGenerator {

    private static CordaGenerator INSTANCE;

    public GenerationResult generate(String destination, Collection<Node> objects) {
        String deployNodesTask = NodeGenerator.getInstance().generateDeployNodesTask(objects);

        return new GenerationResult();
    }

    public static CordaGenerator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CordaGenerator();
        }

        return INSTANCE;
    }
}
