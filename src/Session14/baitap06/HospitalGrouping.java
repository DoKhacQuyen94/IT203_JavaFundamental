package Session14.baitap06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Lớp đại diện cho Bệnh nhân
class Patient {
    private String name;
    private int age;
    private String department; // Khoa điều trị

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Patient(" + name + ")";
    }
}

// Lớp quản lý và phân loại bệnh nhân
public class HospitalGrouping {

    public static void main(String[] args) {
        // 1. Tạo danh sách bệnh nhân đầu vào (Input List)
        List<Patient> inputList = new ArrayList<>();
        inputList.add(new Patient("Lan", 35, "Tim mạch"));
        inputList.add(new Patient("Hùng", 42, "Nội tiết"));
        inputList.add(new Patient("Mai", 28, "Tim mạch"));

        // 2. Khởi tạo cấu trúc Map để gom nhóm
        Map<String, List<Patient>> departmentMap = new HashMap<>();

        // 3. Thực thi logic gom nhóm bệnh nhân vào Map
        for (Patient p : inputList) {
            String deptKey = p.getDepartment();

            // Logic truyền thống theo gợi ý:
            /*
            if (!departmentMap.containsKey(deptKey)) {
                departmentMap.put(deptKey, new ArrayList<>()); // Nếu chưa có, tạo list mới
            }
            departmentMap.get(deptKey).add(p); // Lấy list ra và thêm bệnh nhân vào
            */

            // Logic tối ưu bằng Java 8+ (Khuyên dùng):
            // Nếu Map chưa có deptKey, nó tự tạo ArrayList mới. Sau đó .add(p) luôn.
            departmentMap.computeIfAbsent(deptKey, k -> new ArrayList<>()).add(p);
        }

        // 4. In cấu trúc Map (Output Map Structure)
        System.out.println("--- DANH SÁCH BỆNH NHÂN THEO KHOA ---");
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Key \"" + entry.getKey() + "\" -> Value " + entry.getValue());
        }

        // 5. Hiển thị danh sách bệnh nhân của một khoa bất kỳ
        String searchDept = "Tim mạch";
        System.out.println("\n--- TÌM KIẾM THEO KHOA ---");
        System.out.println("Bệnh nhân đang nằm khoa " + searchDept + ": " +
                departmentMap.getOrDefault(searchDept, new ArrayList<>()));

        // 6. Tìm khoa đang có đông bệnh nhân nhất (Output Analysis)
        System.out.println("\n--- PHÂN TÍCH QUÁ TẢI ---");
        String maxDepartment = "";
        int maxPatients = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            int currentSize = entry.getValue().size();
            if (currentSize > maxPatients) {
                maxPatients = currentSize;
                maxDepartment = entry.getKey();
            }
        }

        if (maxPatients > 0) {
            System.out.println("Khoa " + maxDepartment + " đang đông nhất (" + maxPatients + " bệnh nhân).");
        } else {
            System.out.println("Hiện không có bệnh nhân nào nhập viện.");
        }
    }
}