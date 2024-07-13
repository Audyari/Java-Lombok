package Programmer.Butocakil.Belajar.Java.Lombok.ToString;


import org.junit.jupiter.api.Test;



public class TestToString {

    @Test
    void testToString(){
        var data = new Login("AUDY","PAS");

        System.out.println(data);
    }
}
