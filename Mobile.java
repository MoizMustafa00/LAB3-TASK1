package Lab_03_Tasks;

public class Mobile {
    String brandName;
    String model;
    double price;

    Mobile() {
        brandName = "Unknown Brand";
        model = "Unknown Model";
        price = 0.0;
    }

    Mobile(String brand, String mod, double pri) {
        this.brandName = brand;
        this.model = mod;
        this.price = pri;
    }

    void display() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        System.out.println("Default Values:");
        mobile1.display();
        Mobile mobile2 = new Mobile("Samsung", "Galaxy S24 Ultra", 450000);
        System.out.println("Actual Values:");
        mobile2.display();
    }
}
