package Programmer.Butocakil.Belajar.Java.Lombok.Cleanup;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyClass {

    public static void main(String[] args) {

        try {
            readFile("example.txt");
        } catch (Exception e) {
            // Tangani exception yang dilemparkan oleh readFile()
            System.out.println("File Tidak Ada: " + e.getMessage());
        }
    }


    @SneakyThrows
    public static void readFile(String filename) {
        @Cleanup BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}