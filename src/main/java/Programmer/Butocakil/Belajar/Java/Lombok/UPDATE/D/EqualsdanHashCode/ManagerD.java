package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.D.EqualsdanHashCode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = false)
public class ManagerD extends EmployeeD{

    private final Integer totalEmployee;

    public ManagerD(String id, String name, Integer totalEmployee) {
        super(id, name);
        this.totalEmployee = totalEmployee;
    }
}
