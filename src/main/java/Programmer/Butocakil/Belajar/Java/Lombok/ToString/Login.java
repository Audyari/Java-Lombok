package Programmer.Butocakil.Belajar.Java.Lombok.ToString;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {
        "password",
})
@AllArgsConstructor
public class Login {

    private String name;

    private String password;

}
