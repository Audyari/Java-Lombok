package Programmer.Butocakil.Belajar.Java.Lombok.NonNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.jayway.jsonpath.internal.path.PathCompiler.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemberTest {

    @Test
    void testMember(){

        var data = new Member("ID","ASEP");
        System.out.println(data.getName());

    }

    @Test
    void testConstructorNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member(null, null);
        });

    }

    @Test
    void testSetterNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member("Eko", "Eko");
            member.setName(null);
        });

    }

    @Test
    void testMethodNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member("Eko", "Eko");
            member.sayHello(null);
        });

        try {
            var member = new Member("Eko", "Eko");
            member.sayHello(null);
        } catch (NullPointerException e) {
            // Assert that NullPointerException is thrown
            assert true;
            System.out.println("Keluar EROR Null Pointer");
        }

    }
}
