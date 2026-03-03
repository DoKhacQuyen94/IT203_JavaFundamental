package Session16.kiemTra;

import java.util.List;

public interface IRepository<T> {
    boolean add(T item); // thêm phâần tử vào danh sach
    boolean removeById(String id);// xóa theo id
    T findById(String id); // tìm theo id
    List<T> findAll(); // lấy toàn bộ danh sách
}
