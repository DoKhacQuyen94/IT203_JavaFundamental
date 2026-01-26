package Session2.baitap;

import java.util.Scanner;

public class bai05 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int point = 100;
        System.out.println("--- He thong danh gia doc gia---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");
        while (true){
            System.out.print("So ngay tre cua lan nay: ");
            int day = sc.nextInt();
            if (day == 999){
                break;
            }else {
                System.out.printf("Tra tre %d ngay: -%d diem\n", day, day*2);
                if(day ==0 ){
                    point += 5;
                } else {
                    point -= day *2;
                }
            }
        }
        System.out.printf("Tong diem uy tin: %d\n", point);
        if(point >=120){
            System.out.println("Xep Loai: Doc Gia Than Thiet");
        } else if (point > 80) {
            System.out.println("Xep Loai: Doc Gia Tieu Chuan");
        }else {
            System.out.println("Xep Loai: Doc Gia Can Luu Y");
        }
    }
}
