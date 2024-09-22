package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.G.NonNull;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
public class Member {

    @NonNull
    private String id;

    @NonNull
    private String name;


    public String sayHello(@NonNull String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return "hello " + name + " My name is " + this.name;
    }


}
