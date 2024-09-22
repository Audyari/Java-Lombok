package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.I.With;

import org.junit.jupiter.api.Test;

public class testingWith {

    @Test
    void testWith() {

        RegisterI registerI = new RegisterI("AUDY", "PASSO");

        RegisterI registerI1 = registerI.withUsername("AUDY");

        System.out.println(registerI1);

    }
}
