package Programmer.Butocakil.Belajar.Java.Lombok.EqualsdanHashCode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(exclude = "name")
public class Customers {

    private String id;
    public  String name;

}
