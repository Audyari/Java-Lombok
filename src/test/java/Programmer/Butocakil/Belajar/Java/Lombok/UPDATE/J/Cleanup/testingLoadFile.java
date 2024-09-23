package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.J.Cleanup;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class testingLoadFile {

    @Test
    void testOpenPomXML() throws Exception {

        String s = FileHelper.loadFile("pom.xml");

        System.out.println(s);

    }

    @Test
    void testingopenfilepakelombok() throws IOException {

        String s = FileHelper.loadFileLombok("pom.xml");

        System.out.println(s);


    }
}
