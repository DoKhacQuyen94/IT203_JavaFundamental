package Session14.baitap03;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> map1 = new HashSet<>();
        HashSet<String> map2 = new HashSet<>();
        HashSet<String> map3 = new HashSet<>();
        map1.add("Aspirin");
        map1.add("Caffeine");
        map1.add("Paracetamol");
        map3.add("Aspirin");
        map3.add("Caffeine");
        map3.add("Paracetamol");

        map2.add("Penicillin");
        map2.add("Aspirin");
        // retainAll tìm giao của 2 set

        map1.retainAll(map2);
        System.out.println("Cảnh báo dị ứng: "+map1);

        // removeAll xóa những phần tử giao của 2 set
        map3.removeAll(map2);
        System.out.println("Thành phần an toàn: "+ map3);
    }

}
