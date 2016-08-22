package divisibility;

import java.util.Scanner;

/* @author harris
 */
public class Divisibility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a number: ");
        int value = input.nextInt();

        for (int i = value; i >= 2; i--) {
          
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " : two three five");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " : three five");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i + " : two five");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " : two three");
            } else if (i % 5 == 0) {
                System.out.println(i + " : five");
            } else if (i % 3 == 0) {
                System.out.println(i + " : three");
            } else if (i % 2 == 0) {
                System.out.println(i + " : two");
            }   else {
                System.out.println(i + " : ");
            }

        }

    }

}
