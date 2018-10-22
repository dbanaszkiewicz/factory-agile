package storage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JSONStorageFactoryTest {

    @Test
    void getInstance() {
        JSONStorageFactory i1 = JSONStorageFactory.getInstance();
        JSONStorageFactory i2 = JSONStorageFactory.getInstance();

        assertEquals(i1, i2);
    }

    @Test
    void getModelName() {
        JSONStorageFactory i1 = JSONStorageFactory.getInstance();

        assertTrue(i1.getModelName() == null || i1.getModelName().getClass().isInstance(String.class));
    }

    @Test
    void getBrandName() {
        JSONStorageFactory i1 = JSONStorageFactory.getInstance();

        assertTrue(i1.getBrandName() == null || i1.getBrandName().getClass().isInstance(String.class));
    }
}