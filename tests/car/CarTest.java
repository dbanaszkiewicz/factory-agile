package car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getInstance() {
        Car i1 = Car.getInstance();
        Car i2 = Car.getInstance();

        assertEquals(i1, i2);
    }

    @Test
    void setStorageFactory() {
        Car i1 = Car.getInstance();

        assertThrows(ClassFormatError.class,
                ()->{
                    i1.setStorageFactory(null);
                });
    }

    @Test
    void getModelName() {
        Car i1 = Car.getInstance();

        assertThrows(NullPointerException.class, i1::getModelName);
    }

    @Test
    void getBrandName() {
        Car i1 = Car.getInstance();

        assertThrows(NullPointerException.class, i1::getBrandName);
    }
}