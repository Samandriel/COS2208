package multiplicationtable;

import java.util.Scanner;

/* @author harris
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int val1, val2;

        System.out.print("Enter first Value: ");
        val1 = input.nextInt();
        System.out.print("Enter second value: ");
        val2 = input.nextInt();

        processingValue(val1, val2);
    }

    public static void processingValue(int val1, int val2) {
        /** Process Explain
         * 1. Looping through the inner loop by incrementing x until x==val2
         * 2. When finished inner loop, print a new line character
         * 3. After printing a new line, y will incremented by 1.
         * 4. Repeat the process until y==val2 */
        
        // Create a new line after finish one line (increment vertically)
        for (int y = val1; y <= val2; y++) {
            
            // Printing one line of code (increment horizontally) 
            for (int x = val1; x <= val2; x++) {
                // Elements
                int z = x*y;
                System.out.print(z + "     ");
            }
            System.out.println("\n");
        }

    }

}
