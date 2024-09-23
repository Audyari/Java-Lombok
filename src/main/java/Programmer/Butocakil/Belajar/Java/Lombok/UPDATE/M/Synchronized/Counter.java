package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.M.Synchronized;

import lombok.Getter;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Counter {

    // Problem Race Condition pake lombok



    private Object counterLock = new Object();

    @Getter
    private Long counter = 0L;

    @Synchronized(value = "counterLock")
    public void increment() {
        counter = counter + 1;
        log.info("test ada nya {}",counter);
    }


}

