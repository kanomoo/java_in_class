package chapter5.New;

public class test {
    public static void main(String[] args) {
        String s1 = "abcdef";
        s1 = s1.replace("abc", "ABC");
        System.out.println(s1);
        System.out.println(s1.indexOf("B"));
        System.out.println(s1.indexOf("Z"));

    }
}
