package chapter8.New;

public class Product {
    private String name;
    private double id, price;

    public Product() {
    }

    public Product(double id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Product [name = " + name + ", id = " + id + ", price = " + price + "]";
    }

}
