package test_sbt.test_old_ass.com;

import java.util.Scanner;

public class Triangle {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        while (true) {
            System.out.print("=".repeat(14) + "\n| Main  Menu |\n" + "=".repeat(14) + "\n 1. Triangle 1\n 2. Triangle 2\n 3. Triangle 3\n 4. Triangle 4\n 5. Triangle 5\n 6. Exit\nEnter Choice : ");
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1" -> triangle1();
                case "2" -> triangle2();
                case "3" -> triangle3();
                case "4" -> triangle4();
                case "5" -> triangle5();
                case "6" -> {System.out.println("Exit Program"); System.exit(0);}
                default -> {System.out.println("\nNo input.");}
            }
            System.out.println();
        }
    }

    public void triangle1() {
        System.out.print("\nEnter name : ");
        String name = scanner.nextLine().trim();
        System.out.println();
        String re = "";
        for (int i = 0; i < name.length(); i ++)
            re = name.charAt(i) + re;
        for (int i = 0; i < name.length(); i++)
            System.out.println(" ".repeat(i) + name.substring(i) + re.substring(1, re.length() - i));
    }
    
    public void triangle2() {
        System.out.print("\nEnter name : ");
        String name = scanner.nextLine().trim(), re = "";
        System.out.println();
        for (int i = 0; i < name.length(); i ++)
            re = name.charAt(i) + re;
        for (int i = 0; i < name.length(); i++)
            System.out.println(" ".repeat(name.length() - i - 1) + name.substring(name.length() - i - 1, name.length()) + re.substring(1, i + 1));
    }

    public void triangle3() {
        System.out.print("\nEnter name : ");
        String name = scanner.nextLine().trim(), re = "", output = "", outline = "";
        System.out.println();
        for (int i = 0; i < name.length(); i ++)
            re = name.charAt(i) + re;
        for (int i = 0; i < name.length(); i++) {
            outline += name.charAt(i) + " ";
            output += (" ".repeat(name.length() - i - 1) + outline + "\n");
        }
        System.out.println(output);
    }

    public void triangle4() {
        System.out.print("\nEnter name : ");
        String name = scanner.nextLine().trim(), re = "", output = "", outline = "";
        System.out.println();
        for (int i = 0; i < name.length(); i ++) {
            re = name.charAt(i) + re;
            outline += name.charAt(i) + " ";
        }
        int outlen = outline.length();
        for (int i = 0; i < name.length() * 2; i += 2) {
            output += (" ".repeat(i / 2) + outline.substring(0, outlen - (i + 1)) + "\n");
        }
        System.out.println(output);
    }

    public void triangle5() {
        System.out.print("\nEnter name : ");
        String name = scanner.nextLine().trim(), re = "";
        System.out.println();
        for (int i = 0; i < name.length(); i ++)
            re = name.charAt(i) + re;
        for (int i = 0; i < name.length()- 1; i++)
            System.out.println(" ".repeat(name.length() - i - 1) + name.substring(name.length() - i - 1, name.length()) + re.substring(1, i + 1));
        for (int i = 0; i < name.length(); i++)
            System.out.println(" ".repeat(i) + name.substring(i) + re.substring(1, re.length() - i));
    }

    public static void main(String[] args) {
        new Triangle().start();
    }
}