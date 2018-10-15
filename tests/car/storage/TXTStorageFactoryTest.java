package car.storage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TXTStorageFactoryTest {

    @Test
    void getInstance() {
        TXTStorageFactory i1 = TXTStorageFactory.getInstance();
        TXTStorageFactory i2 = TXTStorageFactory.getInstance();

        assertEquals(i1, i2);
    }

    @Test
    void getModelName() {
        TXTStorageFactory i1 = TXTStorageFactory.getInstance();

        assertTrue(i1.getModelName() == null || i1.getModelName().getClass().isInstance(String.class));
    }

    @Test
    void getBrandName() {
        TXTStorageFactory i1 = TXTStorageFactory.getInstance();

        assertTrue(i1.getBrandName() == null || i1.getBrandName().getClass().isInstance(String.class));
    }
}