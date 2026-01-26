package session1.bai1;

import  java.util.Scanner;

public class bai01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        String BookId = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String BookName = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();
        System.out.print("Nhập giá bìa: ");
        double price = sc.nextInt();
        System.out.print("Sách còn trong kho(true/fale): ");
        boolean isAvailable = sc.nextBoolean();
        System.out.println("---Phiếu thông tin sách---");
        System.out.printf("Tên sách: %s\n", BookName);
        System.out.printf("Mã sách: %s | Tuổi %d năm \n", BookId, 2026-publishYear);
        System.out.printf("Giá bán: %.2f \n", price);
        System.out.printf("Sách còn trong kho: %s\n", isAvailable ? "Còn sách" : "Hết sách" );
    }
}
