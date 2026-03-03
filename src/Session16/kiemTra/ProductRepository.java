package Session16.kiemTra;

import java.util.*;

public class ProductRepository implements IRepository<Product> {

    private List<Product> productList = new ArrayList<>();
    private Map<String, Product> productMap = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || item.getId() == null) {
            return false; // kiểm tra null
        }

        if (productMap.containsKey(item.getId())) {
            return false; // trùng id
        }

        productList.add(item);
        productMap.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if (id == null || !productMap.containsKey(id)) {
            return false;
        }

        Product p = productMap.remove(id);
        productList.remove(p);
        return true;
    }

    @Override
    public Product findById(String id) {
        if (id == null) return null;
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList); // trả bản sao để tránh sửa trực tiếp
    }
}
