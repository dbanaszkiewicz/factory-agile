package car;

class StorageEnum {
    static IStorageFactory DBStorageFactory = car.storage.DBStorageFactory.getInstance();
    static IStorageFactory JSONStorageFactory = car.storage.JSONStorageFactory.getInstance();
    static IStorageFactory TXTStorageFactory = car.storage.TXTStorageFactory.getInstance();
}
