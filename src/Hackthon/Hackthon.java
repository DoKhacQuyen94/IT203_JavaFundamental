//HN-K24-CNTT4_DoKhacQuyen_004

package Hackthon;


import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Hackthon {
    public static void main(String[] args){
        ///  Bài 1
//        System.out.println("========Bài 1 Ý 1===========");
//        nguyenAm("Hello World 2024!");
//        nguyenAm("rikkei edu");

        //Bài 1 ý 2
//        System.out.println("========Bài 1 Ý 2===========");
//        chuanHoaChuoi(" nguyen duc ANH ");
//        chuanHoaChuoi("Đinh Thanh Nam");

        // Bài 2
//        System.out.println("========Bài 2 Ý 1===========");
//        int length = 5;
//        int[] arr = new int[length];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < length; i++) {
//            System.out.printf("Nhập phần tử thứ %d: ",i+1);
//            arr[i] = sc.nextInt();
//        }
//        arr = chenPhanTu(arr,94,1);
//        for (int i = 0; i < arr.length;i++){
//            System.out.printf("Phần tử thứ %d: %d\n",i,arr[i]);
//        }

        // Bài 2 Ý 2
//        System.out.println("========Bài 2 Ý 2===========");
//        int[] arr1 = {10, 5, 8, 12, 3};
//        int [] arr2 = {20, 10, 20, 5};
//        int[] arr3 = {5, 5, 5};
//        TimPhanTuLonNhi(arr1);
//        TimPhanTuLonNhi(arr2);
//        TimPhanTuLonNhi(arr3);

        // Bài 3
        System.out.println("========Bài 3===========");
        int[] arr = {9,3,4,6,2};
        giamDan(arr);
        tangDan(arr);

    }
    public static void nguyenAm(String str){
        String chuoiNguyenAm = "ueoai";
        int countNguyenAm = 0;
        int countPhuAm = 0;
        String str1 = str.toLowerCase().trim();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Character.isLetter(c)) {
                if (chuoiNguyenAm.indexOf(c) != -1) {
                    countNguyenAm++;
                } else {
                    countPhuAm++;
                }
            }
        }
        if(countNguyenAm > countPhuAm){
            System.out.printf("Nguyên âm nhiều hơn (Nguyên âm: %d, phụ âm: %d)\n",
                    countNguyenAm, countPhuAm);
        } else if (countNguyenAm < countPhuAm) {
            System.out.printf("Phụ âm nhiều hơn (Nguyên âm: %d, phụ âm: %d)\n",
                    countNguyenAm, countPhuAm);
        } else {
            System.out.printf("Nguyên âm và phụ âm bằng nhau (%d)\n",
                    countNguyenAm);
        }
    }

    public static void chuanHoaChuoi(String input) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        int cout = 0;
        StringBuilder userName= new StringBuilder();
        StringBuilder user = new StringBuilder();
        for (int i = 0; i <= input.length(); i++) {
            if (i < input.length() && Character.isLetter(input.charAt(i))) {
                word.append(input.charAt(i));
            } else {
                if (word.length() > 0) {
                    cout++;
                    String w = word.toString().toLowerCase();
                    char firstChar = Character.toUpperCase(w.charAt(0));
                    result.append(firstChar).append(w.substring(1)).append(" ");
                    word.setLength(0);
                    if(cout == 3){
                        userName.append(firstChar).append(w.substring(1));
                    }else {
                        user.append(firstChar);
                    }
                }

            }
        }
        userName.append(user);
        System.out.println("Tên chuẩn: "+result);
        System.out.println("UserName: "+userName);
    }

    public static int[] chenPhanTu(int[] arr, int x, int k) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < k; i++) {
            newArr[i] = arr[i];
        }
        newArr[k] = x;
        for (int i = k; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static void TimPhanTuLonNhi(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Mảng phải có ít nhất 2 phần tử");
            return;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Không tồn tại số lớn thứ 2");
        } else {
            System.out.println("Max: " + max);
            System.out.println("Số lớn thứ 2: " + secondMax);
        }
        System.out.println("==============================");
    }

    public static void giamDan(int[] arr){
        for (int i = 0 ; i < arr.length ; i++ ){
            for (int j = 0; j < arr.length-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }

            }
        }
        for (int k: arr){
            System.out.println(k);
        }
    }
    public static void tangDan(int[] arr){
        for (int i = 0 ; i < arr.length ; i++ ){
            for (int j = 0; j < arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }

            }
        }
        for (int k: arr){
            System.out.println(k);
        }
    }

}
