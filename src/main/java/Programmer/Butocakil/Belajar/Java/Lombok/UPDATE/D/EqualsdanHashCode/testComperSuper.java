package Programmer.Butocakil.Belajar.Java.Lombok.UPDATE.D.EqualsdanHashCode;

public class testComperSuper {

    public static void main(String[] args) {

        //Pemilihan antara callSuper = true dan callSuper = false tergantung
        // pada desain hierarki kelas dan relevansi atribut dari kelas induk
        // terhadap kesetaraan objek.

        ManagerD manager1 = new ManagerD("E001", "Alice", 10);
        ManagerD manager2 = new ManagerD("E001", "Alice", 10); // Same employeeId and name, different totalEmployee

        System.out.println(manager1.equals(manager2));

        System.out.println(manager1.hashCode());
        System.out.println(manager2.hashCode());
    }
}

