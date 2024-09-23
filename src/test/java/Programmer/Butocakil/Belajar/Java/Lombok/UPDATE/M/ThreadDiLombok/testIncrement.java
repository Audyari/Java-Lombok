package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.M.ThreadDiLombok;

import Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.M.Synchronized.Counter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testIncrement {

    private final Counter counter = new Counter();

    @Test
    void tesingsycronicedilombok() throws InterruptedException {

        Counter counter = new Counter();
        int numberOfThreads = 1000;

        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(counter::increment);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        assertEquals(Long.valueOf(numberOfThreads), counter.getCounter());


    }

@Test
    void testsyscronizeDUA() throws InterruptedException {

    Counter counter1 = new Counter();



    for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    counter.increment();

                }
            }).start();
        }

        Thread.sleep(5_000L);
        System.out.println(counter.getCounter());

    }
}
