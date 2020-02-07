package pl.gdynia.amw.model;

import pl.gdynia.amw.template.TemplateFiller;

public interface CordaObject {

    String getIdentifier();

    String getTemplatePath();

    default String generateString() {
        return new TemplateFiller(getTemplatePath(), this).fillTemplate();
    }
}

