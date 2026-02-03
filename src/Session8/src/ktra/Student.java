package Session8.src.ktra;

public class Student {
    private String id, name;
    private double score;
    public Student(){
    }
    public Student(String id, String name, double score) {
        setId(id);
        this.name = name;
        this.score = score;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        if (id != null && id.matches("^SV\\d{3}$")) {
            this.id = id;
        } else {
            System.out.println("Mã sinh viên không hợp lệ (VD: SV001)");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getRank(){
        if (score >= 8.0) {
            return "Giỏi";
        } else if (score >= 6.5) {
            return "Khá";
        } else {
            return "Trung bình";
        }
    }
    public String toString() {
        return "Student[id=" + id +
                ", name=" + name +
                ", score=" + score +
                ", rank=" + getRank() + "]";
    }

}
