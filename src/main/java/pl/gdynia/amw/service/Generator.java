package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.gdynia.amw.dto.GenerationResult;
import pl.gdynia.amw.file.Storage;
import pl.gdynia.amw.model.CordaObject;
import pl.gdynia.amw.template.TemplateFiller;

import java.util.Collection;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Generator {

    private static Generator INSTANCE;

    public GenerationResult generate(String destination, Collection<CordaObject> objects) {
        objects.stream().forEach(object -> {
            String result = new TemplateFiller(object.getTemplatePath(), object).fillTemplate();
            Storage.getInstance().storeFile(destination, result, object.getIdentifier());
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
