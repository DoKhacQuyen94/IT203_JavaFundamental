package session1.bai1;

import java.util.Scanner;

public class b05 {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách 4 chữ số (VD: 1236): ");
        int code = scanner.nextInt();
        int thousands = code / 1000;
        int hundreds  = (code / 100) % 10;
        int dozens    = (code / 10) % 10;
        int units     = code % 10;
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        int calculatedCheckDigit = sumOfFirstThreeNumber % 10;
        boolean isValid = (calculatedCheckDigit == units);
        System.out.printf("Chữ số kiểm tra kỳ vọng: %d\n" , units);
        System.out.printf("Kết quả kiểm tra mã sách: %s\n" , isValid ? "Hợp lệ" :"Sai mã");

    }
}
