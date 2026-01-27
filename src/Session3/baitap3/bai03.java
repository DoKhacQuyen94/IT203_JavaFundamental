package Session3.baitap3;

public class bai03 {
    public static void main(String[] args){
        String[] names = {"Java Basic", "Python Intro", "C++ Deep", "Algorithms", "Data Structures"};
        int[] quantities = {50, 20, 5, 12, 50};

        System.out.println("--- THỐNG KÊ KHO SÁCH ---");
        maxQuantityOfBooks(names, quantities);
        System.out.println();
        minQuantityOfBooks(names, quantities);
    }
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int maxVal = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > maxVal) {
                maxVal = quantities[i];
            }
        }
        System.out.println("Sách có số lượng NHIỀU nhất (" + maxVal + " cuốn):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == maxVal) {
                System.out.println(" - " + names[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int minVal = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < minVal) {
                minVal = quantities[i];
            }
        }
        System.out.println("Sách có số lượng ÍT nhất (" + minVal + " cuốn):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == minVal) {
                System.out.println(" - " + names[i]);
            }
        }
    }
}
