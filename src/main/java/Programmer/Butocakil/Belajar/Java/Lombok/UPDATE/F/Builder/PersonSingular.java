package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.F.Builder;


import lombok.*;

import java.util.List;


@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class PersonSingular {

    private String id;

    private  String name;

    private Integer age;

    @Singular
    private List<String> makans;
}
