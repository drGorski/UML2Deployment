package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.gdynia.amw.dictionary.GenerationStatusEnum;
import pl.gdynia.amw.dto.GenerationResult;
import pl.gdynia.amw.model.node.Node;

import java.util.Collection;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CordaGenerator {

    private static CordaGenerator INSTANCE;

    public GenerationResult generate(String destination, Collection<Node> objects) {
        try {
            NodeGenerator.getInstance().generateDeployNodesTask(destination, objects);
        } catch (Exception e) {
            return GenerationResult
                    .builder()
                    .status(GenerationStatusEnum.ERROR)
                    .msg(e.getMessage())
                    .build();
        }

        return GenerationResult.builder().status(GenerationStatusEnum.SUCCESS).build();
    }

    public static CordaGenerator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CordaGenerator();
        }

        return INSTANCE;
    }
}
