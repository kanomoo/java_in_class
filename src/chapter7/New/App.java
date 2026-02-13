package chapter7.New;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "smith", 200);
        Book book2 = new Book("Python", "somsak", 150);
        book1.display();
        book2.display();
        book1.title = "JavaScript";
        book1.display();
    }
}
