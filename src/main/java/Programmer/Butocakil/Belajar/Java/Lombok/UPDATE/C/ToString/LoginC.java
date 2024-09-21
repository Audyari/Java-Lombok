package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.C.ToString;

import lombok.ToString;

@ToString(exclude = "password")
public class LoginC {

    private String username;

    private  String password;

}
