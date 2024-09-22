package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.F.Builder;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class PersonF {

    private String id;

    private  String name;

    private Integer age;

    private List<String> hobbies;
}
