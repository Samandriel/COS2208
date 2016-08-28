package radixconverter;

/* @author harris
 */
public class RadixConverter {
    
    public static void main(String[] args) {
        
        int radix = Menu.selectRadix();
        Menu.initialValue(radix);
        
        int selected = Menu.printMenu(radix);
        Menu.selectMenu(selected);
        
    }
    


}
