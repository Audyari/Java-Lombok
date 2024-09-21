package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.B.Constructor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testConstructor {

    @Test
    void testConstructor() {

        CustomerB customerB = new CustomerB("0001","AUDYARI");

        Assertions.assertEquals("0001",customerB.getId());
        Assertions.assertEquals("AUDYARI",customerB.getName());


    }
}
