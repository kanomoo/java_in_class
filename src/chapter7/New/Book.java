package chapter7.New;

public class Book {
    String title;
    String author;
    double price;

    public Book() {
    }
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println(title + ": " + author + ": " + price);
    }
}
