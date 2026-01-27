package Session3.baitap5;

import java.util.Scanner;

public class bai05 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] books = new int[100];
        books[0] = 101; books[1] = 205; books[2] = 300; books[3] = 450; books[4] = 502;
        int n = 5;
        System.out.println("--- KHO SÁCH BAN ĐẦU ---");
        displayBooks(books, n);
        while (true) {
            if (n == 0) {
                System.out.println("Kho sách đã hết sạch! Chương trình kết thúc.");
                break;
            }
            System.out.print("\nNhập mã sách cần xóa: ");
            int bookIdToDelete = scanner.nextInt();
            int newN = deleteBook(books, n, bookIdToDelete);
            if (newN < n) {
                System.out.println("-> Đã xóa thành công!");
                n = newN;
            } else {
                System.out.println("-> Không tìm thấy mã sách này.");
            }
            displayBooks(books, n);
            break;
        }
    }
    public static int deleteBook(int[] arr, int n, int bookId) {
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            for (int i = position; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            return n - 1;
        }
        return n;
    }
    public static void displayBooks(int[] arr, int n) {
        System.out.print("Danh sách hiện tại (" + n + " cuốn): [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println(" ]");
    }
}