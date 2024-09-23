package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.K.SneakyThrows;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHelperK {

    @SneakyThrows
    public static String loadFile(String file) {

        // Menggunakan try-with-resources untuk memastikan bahwa FileReader dan Scanner ditutup secara otomatis.

        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader fileReader = new FileReader(file);
             Scanner scanner = new Scanner(fileReader)) {

            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
        }

        return stringBuilder.toString();
    }

    @SneakyThrows
    public static String loadFileLombok(String file) {

        // Menggunakan try-with-resources untuk memastikan bahwa FileReader dan Scanner ditutup secara otomatis.

        StringBuilder stringBuilder = new StringBuilder();

        @Cleanup FileReader fileReader = new FileReader(file);
        @Cleanup Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine()).append("\n");
        }


        return stringBuilder.toString();
    }

}