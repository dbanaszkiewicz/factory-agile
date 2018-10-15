package car;

public class Main {

    public static void main(String[] args) {
	    Car car = Car.getInstance();
	    car.setStorageFactory(StorageEnum.JSONStorageFactory);
	    System.out.println(car.getBrandName());
    }
}
