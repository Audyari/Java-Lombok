package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.F.Builder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class testingPenggunaanBuilder {

    @Test
    void testingPakeGetterSetter() {

        ArrayList<String> objects = new ArrayList<>();
        objects.add("makan");
        objects.add("minum");
        objects.add("ngoding");

        PersonF personF = new PersonF();
        personF.setId("0001");
        personF.setName("AUDYARI");
        personF.setAge(41);
        personF.setHobbies(objects);

        System.out.println(personF);


    }

    @Test
    void testingPakeContructor() {

        ArrayList<String> objects = new ArrayList<>();
        objects.add("makan");
        objects.add("minum");
        objects.add("ngoding");


        PersonF personF = new PersonF("001", "Audyari", 123, objects);

        System.out.println(personF);

    }

    @Test
    void iniPakeBuilderLombok() {

        ArrayList<String> objects = new ArrayList<>();
        objects.add("makan");
        objects.add("minum");
        objects.add("ngoding");

        PersonF build = PersonF.builder()
                .id("0001")
                .name("Audyari W")
                .age(41)
                .hobbies(objects)
                .build();
        System.out.println(build);
    }

    @Test
    void testingSinglarColection() {

        var test = PersonSingular.builder()
                .makan("hamburger")
                .makan("PIZZA")
                .build();

        System.out.println(test);
    }
}
