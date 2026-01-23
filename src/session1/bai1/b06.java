import java.util.Scanner;

public class b06 {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int BOOKS_PER_SHELF = 25;
        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = scanner.nextInt();
        int shelfNumber = (stt - 1) / BOOKS_PER_SHELF + 1;
        int position = (stt - 1) % BOOKS_PER_SHELF + 1;
        String zone = (shelfNumber <= 10) ? "Khu Cận (Gần cửa)" : "Khu Viễn (Xa cửa)";
        System.out.println("\n--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + shelfNumber + " - Vị trí " + position);
        System.out.println("Phân khu: " + zone);
    }
}
