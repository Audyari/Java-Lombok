package Programmer.Butocakil.Belajar.Java.Lombok.With;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testWith {

    @Test
    void testWith(){
        var data = new Register("AUDY","Rahasia");
       data.withPassword("APA");

        var data1 = data.withName("ASEP");

        System.out.println(data.getPassword());

        var register1 = new Register("eko", "Eko");
        var register2 = register1.withName("khannedy");

        Assertions.assertEquals(register1.getPassword(), register2.getPassword());
        Assertions.assertNotEquals(register1.getName(), register2.getName());

        System.out.println(register1.getPassword());
        System.out.println(register2.getPassword());
        System.out.println(register1.getName());
        System.out.println(register2.getName());
    }
}
