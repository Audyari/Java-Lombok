package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.G.NonNull;

public class testMember {

    public static void main(String[] args) {
        Member member = Member.builder()
                .id("0001")
                .name("AUDY CORE")
                .build();

        System.out.println(member);

        System.out.println(member.sayHello("null"));
    }
}
