package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.A.GetterdanSetter;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestingGetterdanSetter {

    private static final Logger log = LoggerFactory.getLogger(TestingGetterdanSetter.class);


    @Test
    void testGetterdanSetter() {

        Customer customer = new Customer();

        customer.setId("00001");
        customer.setName("AUDYARI W");

        customer.setId("00002");

        log.info(customer.getId());
        log.info(customer.getName());


    }

    @Test
    void pake() {

        Customer customer = new Customer();

        customer.setId("00001");
        customer.setName("AUDYARI W");

        customer.setId("00002");

        log.info(customer.getId());
        log.info(customer.getName());
    }
}
