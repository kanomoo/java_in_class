package test_sbt.test;

public class test_mid {
    public static void main(String[] args) {
        String input = "A A+ B+ C D".trim();
        while (input.length() > 0) {
            if (input.indexOf(" ") > 0) {
                String sub = input.substring(0, input.indexOf(" "));
                System.out.println(sub);
                input = input.substring(input.indexOf(" ") + 1, input.length());
            } else {
                System.out.println(input);
                break;
            }
        }
    }
}
