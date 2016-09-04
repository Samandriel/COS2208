
package arraysort;
import java.util.Scanner;

public class ArraySort {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int min, max, avg;
        int[] myArray = new int[10];
        
        for (int i=0; i<myArray.length; i++) {
            System.out.print("Enter myArray index " + i + ": ");
            myArray[i] = input.nextInt();
        }
        
        min = findMin(myArray);
        max = findMax(myArray);
        avg = findAverage(myArray);        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);
    }
    
    public static int findMin(int[] myArray) {
        int min = myArray[0];
        
        for(int i=1; i<myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
            i++;
        }
        
        return min;
    }
    
    public static int findMax(int[] myArray) {
        int max = myArray[0];
        
        for(int i=1; i<myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
            i++;
        }
        
        return max;
    }
    
    public static int findAverage(int[] myArray) {
        int avg = 0;
        for(int i=1; i<myArray.length; i++) {
            avg += myArray[i];
        }
        avg /= myArray.length; 
        return avg;
    }
    
}
