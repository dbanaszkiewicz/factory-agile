package car.storage;

import car.IStorageFactory;

public class TXTStorageFactory implements IStorageFactory {
    private static TXTStorageFactory instance = new TXTStorageFactory();

    private TXTStorageFactory(){}

    public static TXTStorageFactory getInstance(){
        return instance;
    }

    public String getModelName() {
        return null;
    }

    public String getBrandName() {
        return null;
    }
}
