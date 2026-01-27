package Session3.baitap6;

import java.util.Arrays;

public class bai06 {
    public static void main(String[] args) {
        int[] arrayFirst = {10, 10, 30, 50, 70};
        int[] arraySecond = {20, 30, 40, 50, 60, 80};

        System.out.println("--- Dữ liệu đầu vào ---");
        System.out.print("Mảng 1: "); displayBooks(arrayFirst);
        System.out.print("Mảng 2: "); displayBooks(arraySecond);

        int[] finalLibrary = mergeBooks(arrayFirst, arraySecond);
        System.out.println("\n--- Kết quả sau khi gộp và loại bỏ trùng ---");
        displayBooks(finalLibrary);
    }

    public static int[] mergeBooks(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] temp = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                k = addElement(temp, k, a[i]);
                i++;
            } else if (a[i] > b[j]) {
                k = addElement(temp, k, b[j]);
                j++;
            } else {
                k = addElement(temp, k, a[i]);
                i++;
                j++;
            }
        }
        while (i < n) {
            k = addElement(temp, k, a[i]);
            i++;
        }
        while (j < m) {
            k = addElement(temp, k, b[j]);
            j++;
        }
        return Arrays.copyOf(temp, k);
    }
    public static int addElement(int[] arr, int currentIndex, int value) {
        if (currentIndex == 0 || arr[currentIndex - 1] != value) {
            arr[currentIndex] = value;
            return currentIndex + 1;
        }
        return currentIndex;
    }
    public static void displayBooks(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }
}
