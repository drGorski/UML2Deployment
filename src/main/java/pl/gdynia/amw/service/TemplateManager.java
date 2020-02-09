package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.Charset;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TemplateManager {

    private static TemplateManager INSTANCE = new TemplateManager();

    @SneakyThrows
    public String readTemplate(String template) {
        File file = new File(getClass().getClassLoader().getResource(template).getFile());
        return FileUtils.readFileToString(file, Charset.forName("UTF-8"));
    }

    public static TemplateManager getInstance() {
        return INSTANCE;
    }
}
