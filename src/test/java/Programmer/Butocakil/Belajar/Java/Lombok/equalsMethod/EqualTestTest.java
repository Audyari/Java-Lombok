package Programmer.Butocakil.Belajar.Java.Lombok.equalsMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class EqualTestTest {

    @Test
    void testEqualsAndHashCode() {
        // Create two instances of EqualTest with the same data
        EqualTest instance1 = new EqualTest();
        instance1.setData("value1");
        instance1.setData1("value2");
        instance1.setData2("value3");

        EqualTest instance2 = new EqualTest();
        instance2.setData("value1");
        instance2.setData1("value2");
        instance2.setData2("value3");

        // Test equals method
        assertEquals(instance1, instance2);

        // Test hashCode method
        assertEquals(instance1.hashCode(), instance2.hashCode());

        // Create another instance with different data
        EqualTest instance3 = new EqualTest();
        instance3.setData("different");
        instance3.setData1("value2");
        instance3.setData2("value3");

        // Test that instances with different data are not equal
        assertNotEquals(instance1, instance3);
        assertNotEquals(instance1.hashCode(), instance3.hashCode());
    }
}