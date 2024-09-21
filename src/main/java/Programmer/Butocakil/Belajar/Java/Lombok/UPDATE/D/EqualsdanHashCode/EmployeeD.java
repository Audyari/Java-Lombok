package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.D.EqualsdanHashCode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode
public class EmployeeD {

    private String id;

    private  String name;

    public EmployeeD(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
