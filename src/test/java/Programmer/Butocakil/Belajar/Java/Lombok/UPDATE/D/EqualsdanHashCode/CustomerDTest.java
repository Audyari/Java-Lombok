package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.D.EqualsdanHashCode;

import Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.A.GetterdanSetter.cobatest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CustomerDTest {

    private static final Logger log = LoggerFactory.getLogger(CustomerDTest.class);


    @Test
    void testing() {

        CustomerD customer = new CustomerD("001", "Alice");

        int i = customer.hashCode();

        System.out.println(i);
    }

    @Test
    void testEquals() {

        CustomerD customer1 = new CustomerD("001", "Alice");
        CustomerD customer2 = new CustomerD("001", "Alice");
        CustomerD customer3 = new CustomerD("002", "Bob");

        // Test equal objects
        assertEquals(customer1, customer2);

        log.info(String.valueOf(customer1.hashCode()));
        log.info(String.valueOf(customer2.hashCode()));
        log.info(String.valueOf(customer3.hashCode()));


        log.info(String.valueOf(customer1.equals(customer2)));

        // Test not equal objects
        assertNotEquals(customer1, customer3);
    }


    @Test
    void testingEXclude() {

        CustomerDExclude customer1 = new CustomerDExclude("001", "Alice");
        CustomerDExclude customer2 = new CustomerDExclude("001", "SEP");

        // Test equal objects
        assertEquals(customer1.hashCode(), customer2.hashCode());

        log.info(String.valueOf(customer1.hashCode()));
        log.info(String.valueOf(customer2.hashCode()));


    }
}
