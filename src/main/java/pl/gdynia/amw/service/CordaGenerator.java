package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.gdynia.amw.dictionary.GenerationStatusEnum;
import pl.gdynia.amw.dto.GenerationResult;
import pl.gdynia.amw.model.Destination;
import pl.gdynia.amw.model.node.CordaNode;

import java.util.Collection;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CordaGenerator {

    private static CordaGenerator INSTANCE;

    public GenerationResult generate(Destination destination, Collection<CordaNode> objects) {
        try {
            NodeGenerator.getInstance().generateDeployNodesTask(destination, objects);
        } catch (Exception e) {
            e.printStackTrace();
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
