package Programmer.Butocakil.Belajar.Java.Lombok.EqualsdanHashCode;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Manager extends Employee{

    private Integer TotalKaryawan;
}
