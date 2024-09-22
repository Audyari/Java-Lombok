package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.I.With;

import lombok.Value;
import lombok.With;

@Value
public class RegisterI {

    @With
    String username;

    String password;
}
