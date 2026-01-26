package Session2.baitap;

import java.util.Scanner;

public class bai01 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tuoi cua ban: ");
        int age = sc.nextInt();
        System.out.print("Nhap so sach ban dang muon: ");
        int countBook = sc.nextInt();
        if (age >= 18 && countBook <3){
            System.out.println("Ban du dieu kien muon sach");
        }else if(age < 18 ){
            System.out.println("Khong du dieu kien");
            System.out.println("- Ly do: Phai du 18 tuoi tro len");
        } else{
            System.out.println("Khong du dieu kien");
            System.out.println("- Ly do: Ban da muon qua 3 cuon sach");
        }
    }
}
