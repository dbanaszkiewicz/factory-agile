package car.storage;

import car.IStorageFactory;

public class JSONStorageFactory implements IStorageFactory {
    private static JSONStorageFactory instance = new JSONStorageFactory();

    private JSONStorageFactory() {}

    public static JSONStorageFactory getInstance() {
        return instance;
    }

    @Override
    public String getModelName() {
        return null;
    }

    @Override
    public String getBrandName() {
        return null;
    }
}
