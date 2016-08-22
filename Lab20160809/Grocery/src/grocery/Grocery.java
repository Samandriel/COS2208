package grocery;

/* @author harris
 */
public class Grocery {
    
    public static void main(String[] args) {
        int counter = 0;
        int continueAdding;
        double totalPrice = 0;
        Product myProduct = new Product();
        
        do {
            myProduct.add();
            
            System.out.println("");
            totalPrice += myProduct.getPricePerProduct();
            counter++;
            System.out.println("=============================");
            System.out.println("Press: 1 - Add more item");
            System.out.println("Press: 0 - quite program");
            continueAdding = Product.input.nextInt();
            if (counter > 999 || continueAdding == 0) {
                break;
            }
        } while (continueAdding == 1);
       
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("Net total: " + totalPrice);
       
    }

}