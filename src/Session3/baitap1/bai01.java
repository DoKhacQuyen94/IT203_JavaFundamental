package Session3.baitap1;

import java.util.Scanner;

public class bai01 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số lượng sách cần thêm (n): ");
        int n = scanner.nextInt();

        int[] myLibrary = addBookToLibraries(n);

        System.out.println("\n--- DANH SÁCH MÃ SÁCH ---");
        displayLibraries(myLibrary);
    }

    public static int[] addBookToLibraries(int n) {
        int[] books = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sách thứ " + (i + 1) + ": ");
            books[i] = scanner.nextInt();
        }

        return books;
    }

    public static void displayLibraries(int[] arr) {
        System.out.print("Mã sách: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}