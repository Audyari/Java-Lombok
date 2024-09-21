package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.A.GetterdanSetter;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testingProtektedSetter {

    private static final Logger log = LoggerFactory.getLogger(testingProtektedSetter.class);


    @Test
    void protectedSetter() {

        Login login = new Login();

        login.setUsername("ASEP");
        login.setPassword("ASEP");

        log.info(login.getUsername());
        log.info(login.getPassword());


    }
}
