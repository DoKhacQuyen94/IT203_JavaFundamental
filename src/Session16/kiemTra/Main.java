package Session16.kiemTra;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int choice;
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        repo.add(new ElectronicProduct("EP1","Laptop",15000000,12));
        repo.add(new ElectronicProduct("EP2","Phone",12000000,12));
        repo.add(new FoodProduct("F01","Thịt Hộp",100000,5));
        repo.add(new FoodProduct("F02","Cá thu",250000,10));
        do {
            displayMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for(Product k: repo.findAll()){
                        k.displayInfo();
                        System.out.printf("Thành tiền: %.2f\n", k.calculateFinalPrice());
                        System.out.println("==========");
                    }
                    break;
                case 2:
                    Product found = repo.findById("EP1");
                    if (found != null) {
                        found.displayInfo();
                    } else {
                        System.out.println("Không tìm thấy!");
                    }

                    break;
                case 3:
                    List<Product> sortedList = repo.findAll();
                    sortedList.sort(Comparator.comparingDouble(Product::getPrice));
                    System.out.println("=== SẮP XẾP THEO GIÁ TĂNG DẦN ===");
                    for (Product p : sortedList) {
                        System.out.println(p.getId() + " - " + p.getPrice());
                    }

                    break;
                case 4:
                    Map<String, Integer> stats = new HashMap<>();
                    for (Product p : repo.findAll()) {
                        String type = p.getClass().getSimpleName();
                        stats.put(type, stats.getOrDefault(type, 0) + 1);
                    }
                    System.out.println("=== THỐNG KÊ ===");
                    System.out.println(stats);
                    break;
                case 5:
                    System.out.println("Bạn đã thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn sai vui lòng chọn lại");
                    break;
            }
        }while (choice !=5);
    }
    static void displayMenu(){
        System.out.println("Menu");
        System.out.println("1. Hiển thị toàn bộ danh sách sản phẩm");
        System.out.println("2. Tìm sản phẩm theo id và hiển thị kết quả");
        System.out.println("3. Sắp xếp danh sách theo giá tăng dần (dùng Collections.sort hoặc" + "Comparator)");
        System.out.println("4. Thống kê số lượng sản phẩm theo từng loại (Electronic, Food)");
        System.out.println("5: Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");


    }
}
