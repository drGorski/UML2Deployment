package pl.gdynia.amw.dictionary;

public class TaggedValuesDict extends Dictionary {

    private static TaggedValuesDict INSTANCE = new TaggedValuesDict();

    private static final String DICT_PATH = "dictionaries/taggedValues.dict";

    @Override
    protected String getDictPath() {
        return DICT_PATH;
    }

    public static TaggedValuesDict getInstance() {
        return INSTANCE;
    }
}
