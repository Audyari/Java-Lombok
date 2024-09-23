package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.L.log;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

@Slf4j
public class FileHelperL {


    public static String loadFile(String file) throws IOException {

        log.error("testing log pake lombok : {} ", file);

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