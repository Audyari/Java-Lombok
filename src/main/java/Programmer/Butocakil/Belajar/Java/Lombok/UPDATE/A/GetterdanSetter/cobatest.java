package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.A.GetterdanSetter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class cobatest {

    private static final Logger log = LoggerFactory.getLogger(cobatest.class);


    public static void main(String[] args) {

        someMethod();
    }

    public static void someMethod() {
        Customer customer = new Customer();

        customer.setId("00001");
        customer.setName("AUDYARI W");

        customer.setId("00002");

        log.info(customer.getId());
        log.info(customer.getName());

    }

}
