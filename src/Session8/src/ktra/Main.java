package Session8.src.ktra;

import java.util.Scanner;

public class Main {
    public static Student[] student = new Student[100];
    public static int count = 0;
    public static int choice;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            displayMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStu();
                    break;
                case 2:
                    displayStudent();
                    break;
                case 3:
                    searchByRank();
                    break;
                case 4:
                    sortByRankDesc();
                    displayStudent();
                    break;
                case 5:
                    System.out.println("Bạn đã thoát chương trình");
                    break;
                default:
                    System.out.println("Chọn sai, nhập lại!");
            }
        } while (choice != 5);
    }
    public static void displayMenu() {
        System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo Học lực");
        System.out.println("4. Sắp xếp theo học lực giảm dần");
        System.out.println("5. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    public static void addStu() {
        if (count >= 100) {
            System.out.println("Danh sách đã đầy");
            return;
        }
        System.out.print("Nhập số sinh viên muốn thêm: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            if (count >= 100) {
                System.out.println("Danh sách đã đầy, không thể thêm nữa");
                break;
            }
            System.out.println("\nNhập sinh viên thứ " + (count + 1));
            student[count] = new Student();
            System.out.print("Nhập Mã Sinh Viên: ");
            student[count].setId(sc.nextLine());
            System.out.print("Nhập Tên: ");
            student[count].setName(sc.nextLine());
            System.out.print("Nhập Điểm: ");
            student[count].setScore(sc.nextDouble());
            sc.nextLine();
            count++;
        }
    }

    public static void displayStudent() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(student[i]);
            System.out.println("--------------------");
        }
    }
    public static void searchByRank() {
        if (count == 0) {
            System.out.println("Danh sách sinh viên đang trống!");
            return;
        }
        System.out.print("Nhập học lực cần tìm (Gioi / Kha / Trung Binh): ");
//        sc.nextLine();
        String rank = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (student[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println("--------------------");
                System.out.println("Mã SV: " + student[i].getId());
                System.out.println("Tên: " + student[i].getName());
                System.out.println("Điểm: " + student[i].getScore());
                System.out.println("Học lực: " + student[i].getRank());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có học lực: " + rank);
        }
    }

    public static int rankValue(Student s) {
        switch (s.getRank()) {
            case "Gioi":
                return 3;
            case "Kha":
                return 2;
            default:
                return 1;
        }
    }
    public static void sortByRankDesc() {
        if (count <= 1) {
            System.out.println("Không đủ sinh viên để sắp xếp");
            return;
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (rankValue(student[i]) < rankValue(student[j])) {
                    Student temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp theo học lực giảm dần!");
    }

}
