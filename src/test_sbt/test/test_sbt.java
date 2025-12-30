3package test_sbt.test;

import java.util.Scanner;

public class test_sbt{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int hour;
        float rate, wage;

        System.out.print("Enter hour work : ");
        hour = input.nextInt();
        System.out.print("Enter hourly rate : ");
        rate = input.nextFloat();
        wage = (hour <= 40 ) ? (hour * rate) : ((40 * rate) + ((hour - 40 ) *1.5f *rate));
        System.out.println("Employee get wage : " + wage);
    }
        
    }

