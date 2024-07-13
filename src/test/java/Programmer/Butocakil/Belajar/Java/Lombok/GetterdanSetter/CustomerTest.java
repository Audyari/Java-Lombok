package Programmer.Butocakil.Belajar.Java.Lombok.GetterdanSetter;

import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer(){
       var cuscomer = new Customer();
       cuscomer.setName("SEP");
       cuscomer.setId("ID NYA");

        System.out.println(cuscomer.getId());
        System.out.println(cuscomer.getName());

    }



}
