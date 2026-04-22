package Udemy;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) return -1L;
//        return Math.round(kilometersPerHour * 0.621371D);
        return Math.round(Math.ceil(kilometersPerHour * 0.622D));

    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) System.out.println("Invalid Value");
        else System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
