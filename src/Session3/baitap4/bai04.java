package Session3.baitap4;

public class bai04 {
    public static void main(String[] args) {
        int[] bookIDs = {120, 50, 30, 90, 10, 70};
        System.out.println("--- Trước khi sắp xếp ---");
        displayBooks(bookIDs);
        sortBooks(bookIDs);
        System.out.println("\n--- Sau khi sắp xếp (Bubble Sort) ---");
        displayBooks(bookIDs);
    }
    public static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void displayBooks(int[] arr) {
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
}
