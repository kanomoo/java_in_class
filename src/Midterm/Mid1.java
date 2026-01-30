package Midterm;

public class Mid1 {
    public void triangle(int m) {
        String output = "";
        for (int i = 0; i <= m; i++)
            if (i != 0 ) output += " ".repeat(i) + "#".repeat(m - i) + "#"  + "#".repeat(m - i) + "\n";
        System.out.println(output);
    }

    public static void main(String[] args) {
        Mid1 obj = new Mid1();
        obj.triangle(5);
        obj.triangle(7);
        obj.triangle(9);
    }
}
