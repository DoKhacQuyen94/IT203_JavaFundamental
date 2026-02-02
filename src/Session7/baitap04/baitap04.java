package Session7.baitap04;
class ClassRoom {
    private static double classFund = 0;
    private String studentName;
    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }
    public void donate(double amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng " + amount + "k");
    }
    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund + "k");
    }
}

public class baitap04 {
    public static void main(String[] args) {
        ClassRoom sv1 = new ClassRoom("Quyền");
        ClassRoom sv2 = new ClassRoom("An");
        ClassRoom sv3 = new ClassRoom("Bình");
        sv1.donate(50);
        sv2.donate(30);
        sv3.donate(20);
        ClassRoom.showClassFund();
    }
}
