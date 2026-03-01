package Session14.baitap01;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // LinkedHashSet nó duy trì thứ tự thêm cái gì vị trí đứng im chỗ đó
        LinkedHashSet<String> tenBenhNhan =  new LinkedHashSet<>();
        System.out.print("Nhập số lượng bệnh nhân cần thêm: ");
        int n = sc.nextInt();
        sc.nextLine();
        for  (int i = 0; i < n; i++) {
            System.out.print("Nhập tên bệnh nhân cần khám: ");
            String name = sc.nextLine();
            tenBenhNhan.add(name);
        }
        System.out.print("Danh sách bệnh nhân cần khám: ");
//        for (String name : tenBenhNhan) {
//            System.out.print(name);
//            System.out.print(", ");
//        }
        System.out.println(tenBenhNhan);
    }
}
