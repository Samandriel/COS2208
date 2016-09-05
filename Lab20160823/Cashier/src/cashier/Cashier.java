package cashier;

import java.util.Scanner;


/* @author harris
 */
public class Cashier {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        Customer cart1 = new Customer();
        int itemCount = cart1.getItemCount();
        boolean addNewItem = cart1.isAddNewItem();
        
        do {
            cart1.addProduct();
        } while (itemCount < 15 && addNewItem == true);
        
        cart1.printReceipt();

    }

}
