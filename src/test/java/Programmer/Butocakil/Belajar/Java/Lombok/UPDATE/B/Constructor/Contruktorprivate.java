package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.B.Constructor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Contruktorprivate {

    @Test
    void contructorPrivate() {

        LoginB empty = LoginB.createEmpty();

        Assertions.assertNull(empty.getUsername());
        Assertions.assertNull(empty.getPassword());

        LoginB loginB = LoginB.create("ASEP", "ASEP");

        Assertions.assertEquals("ASEP",loginB.getUsername());
        Assertions.assertEquals("ASEP",loginB.getPassword());


    }
}
