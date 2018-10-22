import storage.IStorageFactory;

class StorageEnum {
    static IStorageFactory DBStorageFactory = storage.DBStorageFactory.getInstance();
    static IStorageFactory JSONStorageFactory = storage.JSONStorageFactory.getInstance();
    static IStorageFactory TXTStorageFactory = storage.TXTStorageFactory.getInstance();
}
