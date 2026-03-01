package Session14.baitap02;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<>();
        map.put("T01","Paracetamol");
        map.put("T02","Ibuprofen");
        map.put("T03","Loratadine");
        map.put("T04","Betadine");
        map.put("T05","Amoxicillin");
        System.out.print("Nhập mã thuốc cần tìm vào đây: ");
        String maThuoc = sc.nextLine();
        if(map.containsKey(maThuoc)){
            System.out.println("Tên thuốc: "+ map.get(maThuoc));
        }else {
            System.out.println("Mã thuốc không tồn tại!");
        }

    }
}
