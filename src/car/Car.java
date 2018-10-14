package car;

public class Car implements IStorageFactory {
    private IStorageFactory storageFactory;

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
