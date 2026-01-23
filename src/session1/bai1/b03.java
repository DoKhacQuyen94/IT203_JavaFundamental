public class b03 {
    static void main(String[] args){
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.println("--- Trước khi hoán đổi ---");
        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        String temp = book1; // temp lưu tham chiếu mà book1 đang giữ
        book1 = book2;       // book1 trỏ sang nơi book2 đang trỏ
        book2 = temp;        // book2 trỏ sang nơi temp đang giữ (cũ của book1)
        System.out.println("\n--- Sau khi hoán đổi ---");
        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
    }
}
