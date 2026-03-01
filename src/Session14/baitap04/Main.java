package Session14.baitap04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );
        TreeMap<String,Integer> map = new TreeMap<>();
        for(String s : list){
            // getOrDefault()trả về giá trị của mục trong bản đồ có khóa được chỉ định.
            // Nếu mục đó không tồn tại thì giá trị của tham số thứ hai sẽ được trả về.
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : map.keySet()){
            System.out.println(s+": "+map.get(s)+" ca");
        }
    }
}
