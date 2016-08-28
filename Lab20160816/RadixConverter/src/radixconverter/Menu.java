package radixconverter;

import java.util.Scanner;

/* @author harris
 */
public class Menu extends Converter {

    public static Scanner in = new Scanner(System.in);
    
    private static int radix, intVal;
    private static String strVal;
    
    public static int printMenu(int radix) {
        int menu;
        do {
            System.out.println("===========OPTIONS===========");
            switch (radix) {
                case 1:
                    System.out.println("1. Binary to Octal");
                    System.out.println("2. Binary to Decimal");
                    System.out.println("3. Binary to Hexadecimal");
                    break;
                case 2:    
                    System.out.println("4. Octal to Binary");
                    System.out.println("5. Octal to Decimal");
                    System.out.println("6. Octal to Hexadecimal");
                    break;
                case 3:
                    System.out.println("7. Decimal to Binary");
                    System.out.println("8. Decimal to Octal");
                    System.out.println("9. Decimal to Hexadecimal");
                    break;
                case 4:
                    System.out.println("10. Hexadecimal to Binary");
                    System.out.println("11. Hexadecimal to Octal");
                    System.out.println("12. Hexadecimal to Decimal");
            }
            System.out.println("13. Enter a new number");
            System.out.println("14. Exit");
            System.out.println("------------------------------");
            System.out.print("Select Option: ");
            menu = in.nextInt();
            System.out.println("==============================");
            if (menu < 1 || menu > 14) {
                System.out.println("Invalid number!! Try again...");
            }
        } while (menu < 1 || menu > 14);
        return menu;
    }

    public static void selectMenu(int menu) {
        String binary, octal, hexa;
        int decimal;
        
        switch (menu) {
            case 1:
                octal = binaryToOctal(strVal);
                System.out.println("Result: " + octal);
                break;
            case 2:
                decimal = binaryToDecimal(strVal);
                System.out.println("Result: " + decimal);
                break;
            case 3:
                hexa = binaryToHexa(strVal);
                System.out.println("Result: " + hexa);
                break;
            case 4:
                binary = octalToBinary(strVal);
                System.out.println("Result: " + binary);
                break;
            case 5:
                decimal = octalToDecimal(strVal);
                System.out.println("Result: " + decimal);
                break;
            case 6:
                hexa = octalToHexa(strVal);
                System.out.println("Result: " + hexa);
                break;
            case 7:
                binary = decimalToBinary(intVal);
                System.out.println("Result: " + binary);
                break;
            case 8:
                octal = decimalToOctal(intVal);
                System.out.println("Result: " + octal);
                break;
            case 9:
                hexa = decimalToHexa(intVal);
                System.out.println("Result: " + hexa);
                break;
            case 10:
                binary = hexaToBinary(strVal);
                System.out.println("Result: " + binary);
                break;
            case 11:
                octal = hexaToOctal(strVal);
                System.out.println("Result: " + octal);
                break;
            case 12:
                decimal = hexaToDecimal(strVal);
                System.out.println("Result: " + decimal);
                break;
            case 13:
                radix = selectRadix();
                initialValue(radix);
                menu = printMenu(radix);
                selectMenu(menu);
                break;
            case 14:
                break;
        }
    }

    public static int selectRadix() {
        do {
            System.out.println("=====SELECT INITIAL RADIX=====");
            System.out.println("1. Binary");
            System.out.println("2. Octal");
            System.out.println("3. Decimal");
            System.out.println("4. Hexadecimal");
            System.out.println("------------------------------");
            System.out.print("Select base number: ");
            radix = in.nextInt();
            System.out.println("==============================");
        } while(radix < 1 || radix > 4);
        return radix;
    }
    
    
    public static void initialValue(int radix) {
        System.out.print("Enter Intitial Value: ");
        if (radix == 3) {
            intVal = in.nextInt();
        } else {
            strVal = in.next();
        }
        System.out.println("==============================");
      
    }
    
}
