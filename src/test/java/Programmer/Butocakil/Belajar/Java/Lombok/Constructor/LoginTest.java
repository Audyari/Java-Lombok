package Programmer.Butocakil.Belajar.Java.Lombok.Constructor;

import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testLogin(){
        var data = Login.setKosong();

        System.out.println(data.getName());
        System.out.println(data.getPassword());

        var data1 = Login.Create("AUDY","ASEP");

        System.out.println(data1.getName());
        System.out.println(data1.getPassword());



    }
}
