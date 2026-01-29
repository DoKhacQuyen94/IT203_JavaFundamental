package Session5.baikiemtra;

import java.util.Scanner;
import java.util.regex.Pattern;

public class baikiemtra {
    static  String[] mssvList = new String[100];
    static  int count =0;
    static  Scanner sc = new Scanner(System.in);
    static void main (String[] args){
        int choice;
        do {
            displayMenu();
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    displayMssv();
                    break;
                case 2:
                    themMoi();
                    break;
                case 3:
                    capNhat();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    timKiem();
                    break;
                case 6:
                    System.out.println("Hẹn gặp lại!!");
                    break;
                default:
                    System.out.println("Lựa chọn sai. Vui lòng chọn lại!");
            }
        }while (choice != 6);
    }
    public static void displayMenu(){
        System.out.println("----Menu----");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm MSSV ");
        System.out.println("3. Cập nhật ");
        System.out.println("4. Xóa ");
        System.out.println("5.Tìm kiếm ");
        System.out.println("6.Thoát ");
        System.out.println("Mời bạn nhập lựa chọn của mình: ");
    }
    public static void displayMssv(){
        if (count == 0) {
            System.out.println("Danh sách MSSV đang rỗng!");
            return;
        }
        System.out.println("DANH SÁCH MSSV:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + mssvList[i]);
        }
        System.out.println("----------------------");
    }
    public  static void themMoi() {
        if (count >= 100) {
            System.out.println("Mảng đã đầy, không thể thêm!");
            return;
        }

        String mssv;
        while (true) {
            sc.nextLine();
            System.out.print("Nhập MSSV mới: ");
            mssv = sc.nextLine();
            if (Pattern.matches("^B\\d{7}$", mssv)) {
                break;
            }
            System.out.println("Sai định dạng! Ví dụ đúng: B2101234");
        }
        mssvList[count] = mssv;
        count++;
        System.out.println("Thêm MSSV thành công!");
    }
    static void capNhat() {
        if (count == 0) {
            System.out.println("Danh sách rỗng, không thể cập nhật!");
            return;
        }

        System.out.print("Nhập index cần sửa (0 - " + (count - 1) + "): ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index < 0 || index >= count) {
            System.out.println("Index không hợp lệ!");
            return;
        }

        String newMssv;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            newMssv = sc.nextLine();

            if (Pattern.matches("^B\\d{7}$", newMssv)) {
                break;
            }
            System.out.println("MSSV sai định dạng!");
        }

        mssvList[index] = newMssv;
        System.out.println("Cập nhật thành công!");
    }

    public static void delete(){
        if(count == 0){
            System.out.println("Danh sách trống!");
            return;
        }
        sc.nextLine();
        System.out.print("Nhập MSSV cần xóa: ");
        String target = sc.nextLine();

        int index = -1;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].equalsIgnoreCase(target)) {
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Không tìm thấy MSSV");
        }
        for (int i = index; i < count - 1; i++) {
            mssvList[i] = mssvList[i + 1];
        }
        mssvList[count - 1] = null;
        count--;
        System.out.println("Xóa thành công");
    }
    public static void timKiem() {
        if (count == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        sc.nextLine();
        System.out.print("Nhập chuỗi cần tìm: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].toLowerCase().contains(keyword)) {
                System.out.println(mssvList[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có MSSV nào phù hợp!");
        }
    }
}
