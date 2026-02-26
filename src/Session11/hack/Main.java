package Session11.hack;

public class Main {
    public static String chuanHoaChuoi(String input) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i <= input.length(); i++) {
            // Kiểm tra xem ký tự hiện tại có phải chữ cái không
            if (i < input.length() && Character.isLetter(input.charAt(i))) {
                word.append(input.charAt(i));
            } else {
                // Nếu kết thúc một từ
                if (word.length() > 0) {
                    String w = word.toString().toLowerCase();
                    // Viết hoa chữ cái đầu
                    char firstChar = Character.toUpperCase(w.charAt(0));
                    result.append(firstChar).append(w.substring(1)).append(" ");
                    word.setLength(0); // Xóa word để nhận từ tiếp theo
                }
            }
        }
        return result.toString().trim();
    }

    public static void thongKeDuyNhat(String s) {
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == current) count++;
            }
            if (count == 1) {
                System.out.print(current + " ");
            }
        }
    }

    public static void chenPhanTu(int[] arr, int n, int x, int k) {
        // Giả sử mảng đủ sức chứa n+1 phần tử
        for (int i = n; i > k; i--) {
            arr[i] = arr[i - 1]; // Dịch phải
        }
        arr[k] = x;
        n++; // Tăng kích thước ảo của mảng

        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }

    public static void loaiBoTrung(int[] arr, int n) {
        int newSize = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            // Kiểm tra xem arr[i] đã có trong đoạn [0...newSize-1] chưa
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // Nếu chưa có thì đưa về vị trí newSize và tăng newSize
            if (!isDuplicate) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        // In mảng sau khi thu gọn
        for (int i = 0; i < newSize; i++) System.out.print(arr[i] + " ");
    }

    public static void hieuHaiMang(int[] A, int n, int[] B, int m) {
        for (int i = 0; i < n; i++) {
            // 1. Kiểm tra A[i] có trong B không
            boolean inB = false;
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    inB = true;
                    break;
                }
            }

            // 2. Nếu không có trong B, kiểm tra xem đã in A[i] chưa (tránh trùng lặp)
            if (!inB) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (A[i] == A[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.print(A[i] + " ");
                }
            }
        }
    }
}
