package pl.gdynia.amw.dictionary;

public class TaggedValuesDict extends Dictionary {

    private static TaggedValuesDict INSTANCE = new TaggedValuesDict();

    private TaggedValuesDict() {
        try {
            loadDictionary("taggedValues.dict");
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public static TaggedValuesDict getInstance() {
        return INSTANCE;
    }
}
