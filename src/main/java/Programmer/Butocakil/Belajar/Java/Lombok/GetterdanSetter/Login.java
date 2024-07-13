package Programmer.Butocakil.Belajar.Java.Lombok.GetterdanSetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Login {

   @Setter(value = AccessLevel.PROTECTED )
   private String name;

   @Setter(value = AccessLevel.PROTECTED)
   private  String password;

}
