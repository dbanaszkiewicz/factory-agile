package car;

public enum StorageEnum {
    DBStorageFactory,
    JSONStorageFactory,
    TXTStorageFactory;

    public IStorageFactory getInstance() throws Exception {
        switch (this) {
            case DBStorageFactory:
                return car.storage.DBStorageFactory.getInstance();
            case JSONStorageFactory:
                return car.storage.JSONStorageFactory.getInstance();
            case TXTStorageFactory:
                return car.storage.TXTStorageFactory.getInstance();
        }

        throw new Exception("Undefined Enum!");
    }
}
