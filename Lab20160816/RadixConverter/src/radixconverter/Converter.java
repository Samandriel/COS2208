package radixconverter;
/* @author harris
 */
public class Converter {
    private static String binary = "";
    private static String octal = "";
    private static String hexa = "";
    private static int decimal;
    
    public static String binaryToOctal(String val) {
        decimal = binaryToDecimal(val);
        octal = decimalToOctal(decimal);
        return octal;
    }
    
    public static int binaryToDecimal(String val) {
        for(int i=0; i<val.length(); i++) { 
            if(val.charAt(i) == '1') {
                int power = (val.length()-1)-i;
                decimal += Math.pow(2, power);
            }    
        }
        return decimal;
    }
    
    public static String binaryToHexa(String val) {
        decimal = binaryToDecimal(val);
        hexa = decimalToHexa(decimal);
        return hexa;
    }
    
    public static String octalToBinary(String val) {
        decimal = octalToDecimal(val);
        binary = decimalToBinary(decimal);
        return binary;
    }
    
    public static int octalToDecimal(String val) {
        decimal = Integer.parseInt(val, 8);
        return decimal;
    }
    
    public static String octalToHexa(String val) {
        decimal = octalToDecimal(val);
        hexa = decimalToHexa(decimal);
        return hexa;
    }
    
    public static String decimalToBinary(int val) {
        for(int i=val; i>=1; i/=2) {
            int digit = i % 2;
            binary = Integer.toString(digit) + binary;
        }
        return binary;
    }
    
    public static String decimalToOctal(int val) {
        for(int i=val; i>=1; i/=8) {
            int digit = i % 8;
            octal = Integer.toString(digit) + octal;
        }
        return octal;
    }
    
    public static String decimalToHexa(int val) {
       for(int i=val; i>=1; i/=16) {
            int digit = i % 16;
            String hexDigit = hexaDigit(digit);
            octal = hexDigit + octal;
        }
        return octal; 
    }
    
    public static String hexaToBinary(String val) {
        decimal = hexaToDecimal(val);
        binary = decimalToBinary(decimal);
        return binary;
    }
    
    public static String hexaToOctal(String val) {
        decimal = hexaToDecimal(val);
        octal = decimalToOctal(decimal);
        return octal;
    }
    
    public static int hexaToDecimal(String val) {
        decimal = Integer.parseInt(val, 16);
        return decimal;
    }

    
    private static String hexaDigit(int rem) {
        String hexDigit;
        switch(rem) {
            case 10:
                hexDigit = "A";
                break;
            case 11:
                hexDigit = "B";
                break;
            case 12:
                hexDigit = "C";
                break;
            case 13:
                hexDigit = "D";
                break;
            case 14:
                hexDigit = "E";
                break;
            case 15:
                hexDigit = "F";
                break;
            default:
                hexDigit = Integer.toString(rem);
        }
        return hexDigit;
    }
    
}
