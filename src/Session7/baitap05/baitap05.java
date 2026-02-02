package Session7.baitap05;
class Config {
    public static final double MAX_SCORE = 10.0;
    public static final double MIN_SCORE = 0.0;
}

public class baitap05 {
    public static void main(String[] args) {
        double score = 8.5;
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        }
        // ===== THỬ THAY ĐỔI GIÁ TRỊ =====
        // Config.MAX_SCORE = 20.0; // LỖI BIÊN DỊCH
    }
}
