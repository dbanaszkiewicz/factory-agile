package car;

public class Car implements IStorageFactory {
    private static Car instance = new Car();
    private IStorageFactory storageFactory;

    private Car() {}

    static Car getInstance() {
        return instance;
    }

    void setStorageFactory(IStorageFactory storageEnum) {
        this.storageFactory = storageEnum;
    }

    public String getModelName() {
        return storageFactory.getModelName();
    }

    public String getBrandName() {
        return storageFactory.getBrandName();
    }
}
