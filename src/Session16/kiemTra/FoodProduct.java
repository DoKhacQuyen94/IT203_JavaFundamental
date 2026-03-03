package Session16.kiemTra;

public class FoodProduct extends Product {
    private int discountPercent; // phần trăm giảm giá

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateFinalPrice(){
        price = (price - price*discountPercent/100);
        return price;
    }

    @Override
    public void displayInfo(){
        System.out.println("ID: " + getId());
        System.out.println("Name: " + price);
        System.out.printf("Price: %.2f\n", getPrice());
        System.out.println("Discount Percent: " + discountPercent);
    }
}
