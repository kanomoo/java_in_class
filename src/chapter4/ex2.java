// package chapter4;

// import java.text.DecimalFormat;

// public class ex2 {
//     public static void main(String[] args) {
//         System.out.println();
//         System.out.println(" Angle\t\tSin\t\t\tCos\t\t\ttan");
//         for (int n = 1; n <= 75; n++)
//             System.out.print("=");
//         System.out.println();
//         DecimalFormat sixdigit = new DecimalFormat("0.000000");
//         double radians;
//         for (double angle = 0.0; angle <= 360; angle += 20.0) {
//             radians = Math.toRadians(angle);
//             System.out.print(sixdigit.format(angle) + "\t\t");
//             System.out.print(sixdigit.format(Math.sin(radians)) + " \t\t");
//             System.out.print(sixdigit.format(Math.cos(radians)) + "\t\t") ;
//             System.out.println(sixdigit.format(Math.tan(radians)));

//         }
//     }
// }


package chapter4;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Angle\t\t\tSin\t\t\tCos\t\t\tTan\t\n" + "=".repeat(80));
        for (double angle = 0.0; angle <= 360; angle += 20) {
            double radians = Math.toRadians(angle);
            System.out.printf("%10.6f%22.6f%24.6f%24.6f\n", angle, Math.sin(radians), Math.cos(radians), Math.tan(radians));
            // ใช้ prinf แทน DecimalFormat ได้
        }
    }
}