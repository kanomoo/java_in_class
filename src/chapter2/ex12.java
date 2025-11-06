package chapter2;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        int hour, rate;
        float wage;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter hour work : ");
        hour = scan.nextInt();
        System.out.print("Enter hourly rate : ");
        rate = scan.nextInt();
        wage = ((hour > 40) ? ((40 * rate) + ((hour - 40) * 1.5f) * rate) : (hour * rate));
        System.out.print("Employee get wage : " + wage);
        scan.close();
    }
}
