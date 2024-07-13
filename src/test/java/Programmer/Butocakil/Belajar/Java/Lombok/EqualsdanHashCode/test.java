package Programmer.Butocakil.Belajar.Java.Lombok.EqualsdanHashCode;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    void testEqual(){
        var data = new Customers("ID","ASEP");
        var data1 = new Customers("ID","ASEPa");

        if (data.equals(data1)) {
            System.out.println("DATA SAMA");
        } else {
            System.out.println("DATA TIDAK SAMA");
        }

        Assertions.assertEquals(data,data1);
        Assertions.assertEquals(data.hashCode(),data1.hashCode());

    }

    @Test
    void TestEmploye(){
        
        var data = new Manager();
        data.setTotalKaryawan(12);

        var nilai = data.getTotalKaryawan();

        System.out.println(nilai);



    }
}
