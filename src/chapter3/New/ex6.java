// package chapter3.New;

// import java.text.NumberFormat;
// import java.util.Scanner;

// public class ex6 {
//     public static void main(String[] args) {
//         final int NUM_GAMES = 12;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter number of games won(0 to " + NUM_GAMES + ") : ");
//         int won = scanner.nextInt();

//         while (won < 0 || won > NUM_GAMES) {
//             System.out.print("Invalid input. Please reenter : ");
//             won = scanner.nextInt();
//         }

//         float ration = (float) won / NUM_GAMES;
//         NumberFormat fmt = NumberFormat.getPercentInstance();
//         System.out.println("\nWinnig percentage : " + fmt.format(ration));
//     }
// }

package chapter3.New;

import java.text.NumberFormat;
import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int won = 12;
        System.out.print("Enter number games won(0 to 12) : ");
        int game = scanner.nextInt();

        while (game < 0 || game > won) {
            System.out.print("Invalid input. Please reenter : ");
            game = scanner.nextInt();
        }
        float reenter = (float) game / won; // expersit and impersit ใน บรรทัดเดียว
        NumberFormat fmt = NumberFormat.getPercentInstance();
        System.out.println("\nWinning percentage : " + fmt.format(reenter));
        scanner.close();
    }
}