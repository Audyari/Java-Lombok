package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.A.GetterdanSetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login {

    @Setter(AccessLevel.PROTECTED)
    private String username;

    @Setter(AccessLevel.PROTECTED)
    private String password;
}
