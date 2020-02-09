package pl.gdynia.amw.dictionary;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class Dictionary{

    private Map<String, DictionaryEntry> entries;

    public Collection<DictionaryEntry> getValues() {
        return entries.values();
    }

    public DictionaryEntry getValue(String key) {
        return entries.get(key);
    }

    protected void loadDictionary(String fileName) throws IOException {
        entries = new HashMap<>();
        File file = new File(getClass().getClassLoader().getResource(fileName).getFile());
        FileUtils.readLines(file, Charset.forName("UTF-8")).forEach(entry -> entries.put(entry, new DictionaryEntry(entry)));
    }
}
