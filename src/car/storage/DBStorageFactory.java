package car.storage;

import car.IStorageFactory;

public class DBStorageFactory implements IStorageFactory {
    private static DBStorageFactory instance = new DBStorageFactory();

    private DBStorageFactory(){}

    public static DBStorageFactory getInstance(){
        return instance;
    }

    public String getModelName(){
        return null;
    }

    public String getBrandName(){
        return null;
    }
}
