package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.B.Constructor;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor(staticName = "createEmpty")
@AllArgsConstructor(staticName = "create")
public class LoginB {

    @Setter(AccessLevel.PROTECTED)
    private String username;

    @Setter(AccessLevel.PROTECTED)
    private String password;
}
