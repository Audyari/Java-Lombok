package Programmer.Butocakil.Belajar.Java.Lombok.Constructor;

import lombok.*;

@Getter

@AllArgsConstructor(staticName = "Create")
@NoArgsConstructor(staticName = "setKosong")
public class Login {

    @Setter(value = AccessLevel.PROTECTED)
    private String name;

    @Setter(value = AccessLevel.PROTECTED)
    private String password;

}
