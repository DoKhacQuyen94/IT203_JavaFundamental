package Session6.baitap01;
class Student{
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTB;

    public Student(String maSV, String hoTen, int namSinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }
    public void displayStudent(){
        System.out.println("MSV: "+this.maSV);
        System.out.println("Họ Tên: "+this.hoTen);
        System.out.println("Năm Sinh: "+this.namSinh);
        System.out.println("Điểm TB: "+this.diemTB);
        System.out.println("-----------------------------------");
    }
}
public class baitap01 {
    public void main(String[] args){
        Student sv1 = new Student("SV001", "Nguyễn Văn A", 2004, 8.5);
        Student sv2 = new Student("SV002", "Trần Thị B", 2005, 7.8);
        sv1.displayStudent();
        sv2.displayStudent();
    }
}

