package storage;

public class JSONStorageFactory implements IStorageFactory {
    private static JSONStorageFactory instance = new JSONStorageFactory();

    private JSONStorageFactory() {}

    public static JSONStorageFactory getInstance() {
        return instance;
    }

    public String getModelName() {
        return null;
    }

    public String getBrandName() {
        return null;
    }
}
