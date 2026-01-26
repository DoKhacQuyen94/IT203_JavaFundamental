package Session2.baitap;

import java.util.Scanner;

public class bai03 {
    static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach muon tra: ");
        int count = sc.nextInt();
        int total=0;
        for(int i =0 ; i <count ; i++){
            System.out.printf("Nhap so ngay tre cua cuon thu %d: ",i+1);
            int day = sc.nextInt();
            total = total +(day * 5000);
        }
        System.out.printf("===> Tong tien phat: %d VND", total);
    }
}
