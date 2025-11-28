// package chapter3;

// import java.text.NumberFormat; // NumberFormat เป็นคลาสที่ใช้สำหรับการจัดรูปแบบตัวเลข (formatting numbers)
// import java.util.Scanner;

// public class ex8 {
//     public static void main(String[] args) {
//         final int NUM_GAMES = 12;
//         int won;
//         Scanner scanner= new Scanner(System.in);
//         System.out.print("Enter number of games won(0 to " + NUM_GAMES + ") : ");
//         won = scanner.nextInt();
//         while (won < 0 || won > NUM_GAMES) {
//             System.out.print("Invalid input. Please reenter : ");
//             won = scanner.nextInt();
//         }
//         float ration = (float) won / NUM_GAMES;
//         NumberFormat fmt = NumberFormat.getPercentInstance();
//         //getPercentInstance() ทำหน้าที่สร้างอินสแตนซ์(object) ที่รู้จักรูปแบบเปอร์เซ็นต์ไว้ เป็นเมธอด static คือ เมธอดที่เป็นของคลาสโดยตรง ไม่จำเป็นต้อง new ในการสร้าง object ใหม่
//         // ซึ่งต่างจากพวก Decimalformat ที่จำเป็นต้อง new ในการกำหนดอินสแตนซ์(object) ก่อนใช้
//         System.out.println();
//         System.out.println("Winning percentage : " + fmt.format(ration)); //.format() คือเมธอดที่รับค่าตัวเลขมาแปลงตามรูปแบบนั้น และคืนข้อความ
//         scanner.close();
//     }
// }


// package chapter3;

// import java.text.NumberFormat;
// import java.util.Scanner;

// public class ex8 {
//     public static void main(String[] args) {
//         final int NUM_GAMES = 12;
//         int won;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter number of games won(0 to " + NUM_GAMES + ") : ");
//         won = scanner.nextInt();
//         while (won < 0 || won > NUM_GAMES) {
//             System.out.print("Invalid input. Please reenter : ");
//             won = scanner.nextInt();
//         }
//         float ration = (float) won / NUM_GAMES;
//         NumberFormat fmt = NumberFormat.getPercentInstance();
//         System.out.println();
//         System.out.println("Winning percentage : " + fmt.format(ration));
//         scanner.close();
//     }
// }



// package chapter3;

// import java.text.NumberFormat;
// import java.util.Scanner;

// public class ex8 {
//     public static void main(String[] args) {
//         final int num_games  = 12;
//         System.out.print("Enter number of games won(0 to " + num_games + ") : ");
//         Scanner scan = new Scanner(System.in);
//         NumberFormat fmt = NumberFormat.getPercentInstance();
//         int won = scan.nextInt();
//         while (won < 0 || won > 12) {
//             System.out.print("Invalid input. Please reenter : ");
//             won = scan.nextInt();
//         }
//         System.out.println("\nWinnig percentage : " + fmt.format((float) won / num_games));
//     }

// }


package chapter3;

import java.text.NumberFormat;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        final int num_game = 12;
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getPercentInstance(); //getPercentInstance() ทำหน้าที่สร้างอินสแตนซ์(object)ที่รู้จักรูปแบบเปอร์เซ็นต์ไว้ เป็นเมธอด static คือ เมธอดที่เป็นของคลาสโดยตรง ไม่จำเป็นต้อง new ในการสร้าง object ใหม่
        System.out.print("Enter number of games won(0 to " + num_game + ") : ");
        int won = scan.nextInt();
        while (won < 0 || won > 12) {
            System.out.print("Invalid  input. Please reenter : ");
            won = scan.nextInt();
        }
        System.out.println("\nWinning percentage : " + fmt.format((float) won / num_game)); //.format() คือเมธอดที่รับค่าตัวเลขมาแปลงตามรูปแบบนั้น และคืนข้อความ
        scan.close();
    }
}