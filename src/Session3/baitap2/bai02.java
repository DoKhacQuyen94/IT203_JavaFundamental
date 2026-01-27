package Session3.baitap2;

import java.util.Scanner;

public class bai02 {
    public static Scanner sc = new Scanner(System.in);
    public static String[] books = {"Doraemon", "Conan", "Contra", "Dragon ball", "kkk"};

    public static void main(String[] args) {
        System.out.print("Mời nhập tên sách: ");
        String search = sc.nextLine();
        int check = searchBooks(books, search);
        if (check != -1) {
            System.out.println("Tìm thấy sách tại vị trí: " + check);
        } else {
            System.out.println("Không tìm thấy sách!");
        }
    }

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }
}