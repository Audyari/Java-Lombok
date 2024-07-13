package programmerzamannow.lombok;

import Programmer.Butocakil.Belajar.Java.Lombok.Constructor.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {

        var customer = new Customer();
        customer.setId("100");
        customer.setName("Eko");

        System.out.println(customer.getId());
        System.out.println(customer.getName());

    }

    @Test
    void testCustomerConstructor() {

        var customer = new Customer("ID", "NAME");
        Assertions.assertEquals("ID", customer.getId());
        Assertions.assertEquals("NAME", customer.getName());

    }

    @Test
    void testEquals() {

        var customer1 = new Customer("ID", "NAME 1");
        var customer2 = new Customer("ID", "NAME 2");

        var data = customer1.hashCode();
        var data1 = customer2.hashCode();

        System.out.println(data);
        System.out.println(data1);

    }
}