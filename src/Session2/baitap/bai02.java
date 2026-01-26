package Session2.baitap;

import java.util.Scanner;

public class bai02 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khu vuc (A,B,C,D): ");
        String Input = sc.next();
        switch (Input){
            case "A":
                System.out.println("Vi tri: Tang 1 - Sach van hoc");
                break;
            case "B":
                System.out.println("Vi tri: Tang 2 - Sach khoa hoc");
                break;
            case "C":
                System.out.println("Vi tri: Tang 3 - Sach ngoai ngu");
                break;
            case "D":
                System.out.println("Vi tri: Tang 4 - Sach tin hoc");
                break;
            default:
                System.out.println("Loi: Ma khu vuc khong hop le");
                break;
        }
    }
}
