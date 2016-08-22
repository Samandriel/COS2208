package grocery;

import java.util.Scanner;


/* @author harris
 */
public class Product {
   public static Scanner input = new Scanner(System.in);
   
   // Initialize variable
    private String product;
    private int productID, unit;
    private double pricePerUnit, pricePerProduct;
   
   public void add() {
       System.out.println("=== ADD PRODUCT ===");
       System.out.print("Product name: ");
       product = input.next();
       System.out.print("Product ID: ");
       productID = input.nextInt();
       System.out.print("Price per unit: ");
       pricePerUnit = input.nextDouble();
       System.out.print("Unit: ");
       unit = input.nextInt();

       
       pricePerProduct = pricePerUnit*unit;
       System.out.println("Total price for" + product + ": " + pricePerProduct);
   }
   
   public double getPricePerProduct() {
       return pricePerProduct;
   }
}
