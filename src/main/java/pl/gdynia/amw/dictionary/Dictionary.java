package pl.gdynia.amw.dictionary;


import org.apache.commons.io.FileUtils;
import pl.gdynia.amw.consts.Consts;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class Dictionary{

    private Map<String, DictionaryEntry> entries;

    protected Dictionary() {
        try {
            loadDictionary();
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public Collection<DictionaryEntry> getValues() {
        return entries.values();
    }

    public DictionaryEntry getValue(String key) {
        return entries.get(key);
    }

    protected void loadDictionary() throws IOException {
        entries = new HashMap<>();
        File file = new File(getClass().getClassLoader().getResource(getDictPath()).getFile());
        FileUtils.readLines(file, Charset.forName(Consts.UTF_8)).forEach(entry -> entries.put(entry, new DictionaryEntry(entry)));
    }

    protected abstract String getDictPath();
}
