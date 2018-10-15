package car.storage;

import car.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBStorageFactoryTest {

    @Test
    void getInstance() {
        DBStorageFactory i1 = DBStorageFactory.getInstance();
        DBStorageFactory i2 = DBStorageFactory.getInstance();

        assertEquals(i1, i2);
    }

    @Test
    void getModelName() {
        DBStorageFactory i1 = DBStorageFactory.getInstance();

        assertTrue(i1.getModelName() == null || i1.getModelName().getClass().isInstance(String.class));
    }

    @Test
    void getBrandName() {
        DBStorageFactory i1 = DBStorageFactory.getInstance();

        assertTrue(i1.getBrandName() == null || i1.getBrandName().getClass().isInstance(String.class));
    }
}