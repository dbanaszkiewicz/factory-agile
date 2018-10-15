package car;

public class Car implements IStorageFactory {
    private static Car instance = new Car();
    private IStorageFactory storageFactory;

    private Car() {}

    static Car getInstance() {
        return instance;
    }

    void setStorageFactory(StorageEnum storageEnum) {
        try {
            this.storageFactory = storageEnum.getInstance();
        } catch (Exception e) {
            System.out.println("This StorageEnum not exists!");
            System.exit(1);
        }
    }

    public String getModelName() {
        return storageFactory.getModelName();
    }

    public String getBrandName() {
        return storageFactory.getBrandName();
    }
}
