package Session16.kiemTra;

public class ElectronicProduct extends Product {
    private int warrantyMonths; // số tháng bảo hành
    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice(){
        if (warrantyMonths > 12){
            price = (price + 1000000);
            return price;
        }else {
            return price;
        }
    }
    @Override
    public void displayInfo(){
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.printf("Price: %.2f\n" , price);
        System.out.println("Warranty Months: " + warrantyMonths);
    }

}
