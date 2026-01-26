package session1.bai1;

import java.util.Scanner;

public class b04 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (USD): ");
        double bookPrice = sc.nextDouble();
        float exchangeRate = 25450.0f;
        double calculatedTotal = bookPrice * exchangeRate;
        long totalVnd = (long) calculatedTotal;
        System.out.printf("Giá chính xác (Số thực): %f\n", calculatedTotal);
        System.out.printf("Giá làm tròn để tính toán %d", totalVnd);

    }
}
