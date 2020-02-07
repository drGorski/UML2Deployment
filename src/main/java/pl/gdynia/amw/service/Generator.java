package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.gdynia.amw.dto.GenerationResult;
import pl.gdynia.amw.model.CordaObject;

import java.util.Collection;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Generator {

    private static Generator INSTANCE;

    public GenerationResult generate(String destination, Collection<CordaObject> objects) {
        objects.stream().forEach(object -> {
            //TODO generate result files
        });

        return new GenerationResult();
    }

    public static Generator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Generator();
        }

        return INSTANCE;
    }
}
