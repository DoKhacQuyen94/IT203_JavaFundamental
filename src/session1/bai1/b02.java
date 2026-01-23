import java.util.Scanner;

public class b02 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ngày chậm trễ: ");
        int day = sc.nextInt();
        System.out.print("Nhập số lượng sách mượn:  ");
        int count = sc.nextInt();
        double total = day * count * 5000;
        System.out.printf("Tiền phạt gốc: %.2f VND\n", total);
        if(day > 7 && count >=3) {
            total = total + (total * 0.2);
        }
        System.out.printf("Tiền sau điều chỉnh: %.2f VND\n", total);
        System.out.printf("Yêu cầu khóa thẻ: %s\n", total > 50000 ? "true" : "false");

    }
}
