package Session7.baitap02;
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

public class baitap02 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a); // vẫn là 10
        System.out.println("b = " + b); // 20

        // ===== BIẾN THAM CHIẾU =====
        Student s1 = new Student("Quyền");
        Student s2 = s1; // sao chép ĐỊA CHỈ

        s2.name = "Gen Z";

        System.out.println("\nReference:");
        System.out.println("s1.name = " + s1.name); // Gen Z
        System.out.println("s2.name = " + s2.name); // Gen Z
    }
}
