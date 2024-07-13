package Programmer.Butocakil.Belajar.Java.Lombok.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
public class Member {

    @NonNull
    private String id;

    @NonNull
    private String name;

    public String sayHello(@NonNull String name){
        return "Hello " + name + ", my name is " + this.name;
    }




}
