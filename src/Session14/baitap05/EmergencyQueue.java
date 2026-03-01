package Session14.baitap05;

import java.util.Comparator;
import java.util.TreeSet;

// Lớp đại diện cho Bệnh nhân
class Patient {
    private String name;
    private int severity; // 1: Nguy kịch, 2: Nặng, 3: Nhẹ
    private String arrivalTime;

    public Patient(String name, int severity, String arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() { return name; }
    public int getSeverity() { return severity; }
    public String getArrivalTime() { return arrivalTime; }

    // Dịch mức độ ra chuỗi để in cho đẹp
    public String getSeverityLabel() {
        switch (severity) {
            case 1: return "Nguy kịch";
            case 2: return "Nặng";
            case 3: return "Nhẹ";
            default: return "Không xác định";
        }
    }

    @Override
    public String toString() {
        return String.format("Bệnh nhân %s (Mức %d - %s, đến lúc %s)",
                name, severity, getSeverityLabel(), arrivalTime);
    }
}

// Lớp quản lý hàng đợi
public class EmergencyQueue {
    public static void main(String[] args) {
        // Implement Comparator trực tiếp bằng Lambda Expression kết hợp thenComparing
        Comparator<Patient> priorityComparator = Comparator
                .comparingInt(Patient::getSeverity)          // 1. Ưu tiên severity nhỏ hơn
                .thenComparing(Patient::getArrivalTime)      // 2. Nếu bằng, ưu tiên arrivalTime nhỏ hơn
                .thenComparing(Patient::getName);            // 3. Fallback: tránh mất dữ liệu trùng thời gian

        // Khởi tạo TreeSet với Comparator tự tạo
        TreeSet<Patient> emergencyQueue = new TreeSet<>(priorityComparator);

        // Thêm các bệnh nhân vào Set (Dùng định dạng 08:xx để String so sánh chính xác nhất)
        emergencyQueue.add(new Patient("A", 3, "08:00"));
        emergencyQueue.add(new Patient("B", 1, "08:15"));
        emergencyQueue.add(new Patient("C", 1, "08:05"));

        // Thêm một ca để test tính năng fallback (Cùng mức 1, cùng đến 08:05 như C)
        emergencyQueue.add(new Patient("D", 1, "08:05"));

        // In kết quả
        System.out.println("--- THỨ TỰ XỬ LÝ BỆNH NHÂN ---");
        for (Patient p : emergencyQueue) {
            System.out.println(p.toString());
        }
    }
}