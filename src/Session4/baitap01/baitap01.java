package Session4.baitap01;

import java.util.Scanner;

public class baitap01 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- NHẬP THÔNG TIN SÁCH ---");
        System.out.print("Nhập tên sách: ");
        String rawTitle = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String rawAuthor = sc.nextLine();
        System.out.print("Nhập thể loại: ");
        String rawGenre = sc.nextLine();

        String cleanTitle = rawTitle.trim().toUpperCase();
        String cleanAuthor = toTitleCase(rawAuthor);
        System.out.println("["+cleanTitle +"]" + " - Tác giả: " + cleanAuthor);
    }
    public static String toTitleCase(String input) {
        if (input.isEmpty()) return "";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                String firstChar = word.substring(0, 1).toUpperCase();
                String otherChars = word.substring(1).toLowerCase();
                result.append(firstChar).append(otherChars).append(" ");
            }
        }
        return result.toString().trim();
    }
}
