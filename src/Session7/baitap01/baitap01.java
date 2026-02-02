package Session7.baitap01;
class Student {
    private String studentId;
    private String name;
    public static int totalStudents = 0;
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        totalStudents++;
    }
    public void displayInfo() {
        System.out.println("-> Đã tạo: " + this.name + " (" + this.studentId + ")");
    }
    public static void displayTotal() {
        System.out.println("=> Tổng số sinh viên hiện có: " + totalStudents);
    }
}
public class baitap01 {
    static void main(String[] args){
        System.out.println("--- Ban đầu ---");
        Student.displayTotal();
        Student s1 = new Student("SV001", "Nguyen Van A");
        s1.displayInfo();
        Student.displayTotal();
        Student s2 = new Student("SV002", "Tran Thi B");
        s2.displayInfo();
        Student.displayTotal();
        Student s3 = new Student("SV003", "Le Van C");
        s3.displayInfo();
        System.out.println("\n--- TỔNG KẾT CUỐI CÙNG ---");
        System.out.println("Xem từ s1: " + s1.totalStudents);
        System.out.println("Xem từ s2: " + s2.totalStudents);
        Student.displayTotal(); // Cách chuẩn nhất: Gọi từ tên lớp
    }
}
