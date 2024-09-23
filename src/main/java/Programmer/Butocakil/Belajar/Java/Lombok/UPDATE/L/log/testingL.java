package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.L.log;

import Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.K.SneakyThrows.FileHelperK;

import java.io.IOException;

public class testingL {

    public static void main(String[] args) throws IOException {

        String s = FileHelperL.loadFile("pom.xml");

        System.out.println(s);


    }
}
