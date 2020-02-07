package pl.gdynia.amw.template;

import pl.gdynia.amw.annotation.TemplateTag;
import pl.gdynia.amw.model.CordaObject;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class TemplateFiller {

    private CordaObject object;
    private String template;

    public TemplateFiller(String templatePath, CordaObject object) {
        try {
            template = new String(Files.readAllBytes(Paths.get(getClass().getResource(templatePath).toURI())));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

        this.object = object;
    }

    public String fillTemplate() {
        Arrays.stream(object.getClass().getMethods())
                .filter(method -> method.isAnnotationPresent(TemplateTag.class))
                .forEach(method -> {
                    String tag = getTag(method);
                    String value = getValue(method);

                    if (tag != null && value != null) {
                        template = template.replace(tag, value);
                    }
                });

        return template;
    }

    private String getTag(Method method) {
        if (!method.isAnnotationPresent(TemplateTag.class)) {
            return null;
        }

        return Arrays.stream(method.getAnnotationsByType(TemplateTag.class)).findFirst().get().value();
    }

    private String getValue(Method method) {
        try {
            Object result = method.invoke(object);
            if (result == null || result.getClass() != String.class) {
                return null;
            }

            return (String) result;
        } catch (Exception e) {

        }

        return null;
    }
}

