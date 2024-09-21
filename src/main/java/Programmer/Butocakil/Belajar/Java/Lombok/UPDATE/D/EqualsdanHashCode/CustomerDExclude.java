package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.D.EqualsdanHashCode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode(exclude = "name")
public class CustomerDExclude {

    private String id;

    private String name;
}
