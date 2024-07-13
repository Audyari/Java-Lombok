package Programmer.Butocakil.Belajar.Java.Lombok.Constructor;

import org.junit.jupiter.api.Test;

public class MerchantTest {

    @Test
    void testMerchant(){
        var data = new Merchant("ID");


        data.setName("Nama");
        System.out.println(data.getId());
        System.out.println(data.getName());



    }
}
