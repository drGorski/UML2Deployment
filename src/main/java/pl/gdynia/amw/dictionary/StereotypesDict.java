package pl.gdynia.amw.dictionary;

public class StereotypesDict extends Dictionary {

    private static StereotypesDict INSTANCE = new StereotypesDict();

    private StereotypesDict() {
        try {
            loadDictionary("stereotypes.dict");
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public static StereotypesDict getInstance() {
        return INSTANCE;
    }
}
