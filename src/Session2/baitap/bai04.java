package Session2.baitap;

import java.util.Scanner;

public class bai04 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ID;
        do {
            System.out.print("Nhap ma ID sach moi (phai >0): ");
            ID = sc.nextInt();
            if(ID <=0) {
                System.out.println("Loi: ID phai la so duong. Moi Nhap Lai");
            }else {
                System.out.printf("Xac Nhan: Ma sach %d duoc ghi nhan",ID);
            }
        }while (ID <=0);
    }
}
