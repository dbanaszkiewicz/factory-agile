package car;

public class Car implements IStorageFactory {
    private static Car instance = new Car();
    private IStorageFactory storageFactory;

    private Car() {}

    public static Car getInstance() {
        return instance;
    }

    public void setStorageFactory(IStorageFactory storageFactory) {
        this.storageFactory = storageFactory;
    }

    public String getModelName() {
        return storageFactory.getModelName();
    }

    public String getBrandName() {
        return storageFactory.getBrandName();
    }
}
