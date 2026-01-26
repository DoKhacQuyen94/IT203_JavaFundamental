package Session2.baitap;

import java.util.Scanner;

public class bai06 {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int maxBook = Integer.MIN_VALUE;
        int minBook = Integer.MAX_VALUE;
        int totalBooks = 0;
        int activeDays = 0;

        System.out.println("--- THỐNG KÊ LƯỢT MƯỢN SÁCH TUẦN ---");

        for (int i = 1; i <= 7; i++) {
            String dayName;
            if (i == 7) {
                dayName = "Chu Nhat";
            } else {
                dayName = "Thu " + (i + 1);
            }
            System.out.print("Nhap luot muon ngay " + dayName + ": ");
            int currentBorrow = scanner.nextInt();
            if (currentBorrow == 0) {
                System.out.println("-> (Ngay nay dong cua, khong tinh)");
                continue;
            }
            if (currentBorrow > maxBook) {
                maxBook = currentBorrow;
            }
            if (currentBorrow < minBook) {
                minBook = currentBorrow;
            }
            totalBooks += currentBorrow;
            activeDays++;
        }


        System.out.println("\n--- KET QUA ---");
        if (activeDays > 0) {
            double average = (double) totalBooks / activeDays;
            System.out.println("Cao nhat: " + maxBook);
            System.out.println("Thap nhat: " + minBook);
            System.out.println("Trung binh (cac ngay mo cua): " + average);
        } else {
            System.out.println("Tuan nay thu vien dong cua hoan toan!");
        }
    }
}
