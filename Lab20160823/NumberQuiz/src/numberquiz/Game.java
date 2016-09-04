package numberquiz;

import java.util.Scanner;

/* @author harris
 */
public class Game {
   
   public static Scanner input = new Scanner(System.in);
   
   public static boolean newGame = true;
   
   public static void playGame() {
        int[] initNumbers = new int[10];

        // Random Initial Numbers
        for (int i = 0; i < initNumbers.length; i++) {
            initNumbers[i] = (int) (Math.random() * 100);
        }

        boolean win;
        int counter = 0;
        
        System.out.println("====== START GAME =======");
        do {
            System.out.print("Guess the number: ");
            int guess = input.nextInt();
            win = compare(initNumbers, guess);
            if (win != true) {
                System.out.println("Missing");
                counter++;
            } else {
                break;
            }

        } while (win == false && counter != 5); // Limit guessing upto 5 times

        
        if (win == true) {
            System.out.println("==========================");
            System.out.println("CONGRATULATION");

        } else {
            System.out.println("==========================");
            System.out.println("GAME OVER");

        }
    }

    public static void newGame() {
        do {
            // Check option value
            int value;
            do {
                System.out.println("==========================");
                System.out.print("Play Again? \n - Press 1 to continue \n - Press 0 to exit \n Enter value: ");
                value = input.nextInt();

                switch (value) {
                    case 1:
                        playGame();
                        break;
                    case 0:
                        newGame = false;
                        break;
                    default:
                        System.out.println("Invalid value!!");
                        System.out.println("==========================");
                        System.out.print("Play Again? \n - Press 1 to continue \n - Press 0 to exit \n Enter value: ");
                        value = input.nextInt();
                }
            } while (value < 0 || value > 1);
            
        } while (newGame == true);
    }
            
    private static boolean compare(int[] numbers, int guess) {
        boolean win = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == guess) {
                win = true;
            }
        }

        return win;
    }
}
