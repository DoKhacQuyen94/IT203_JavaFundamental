package Session6.baitap03;
class Product{
    private String maSp;
    private String tenSp;
    private double giaBan;
    public Product(String maSp, String tenSp){
        this.maSp = maSp;
        this.tenSp = tenSp;
    }
    public String getMaSP() {
        return maSp;
    }

    public String getTenSP() {
        return tenSp;
    }

    public double getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Giá bán không hợp lệ! Phải > 0");
        }
    }
    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSp);
        System.out.println("Tên SP: " + tenSp);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("--------------------");
    }

}
public class baitap03 {
    public static void main(String[] args){
        Product p1 = new Product("SP001", "Chuột Gaming");
        p1.setGiaBan(350000);
        p1.setGiaBan(-100000);
        p1.hienThiThongTin();
    }
}
