package cashier;

import static cashier.Cashier.in;

/* @author harris
 */
public class Customer {

    public Product[] cart = new Product[15];

    private int itemCount = 0;
    private boolean addNewItem;
    private int codeGen;

    public void addProduct() {
        // User input product details
        System.out.println("======= ADD PRODUCTS ========");
        System.out.print("Product Name: ");
        String title = in.next();

        System.out.print("Price per unit: ");
        double price = in.nextDouble();

        System.out.print("Buying Quantity: ");
        int qty = in.nextInt();
        
        // Adding product to cart
        System.out.println("Confirm transaction...");
        System.out.println("- Press 'd' to cancel this item");
        System.out.println("- Press 'x' to checkout and print the receipt");
        System.out.println("- Press Other key to continue");
        System.out.print("Enter key: ");
        String key = in.next();
        
        if (key.equals("d")) {
            // Not adding product to cart but continue transaction
            addProduct();
        } else if (key.equals("x")) {
            // Add product to cart array then exit
            codeGen++;
            cart[itemCount] = new Product(codeGen, title, price, qty);
            itemCount++;
            System.out.println("Item " + itemCount + " Added");
            addNewItem = false;
        } else {
            // Add product to cart, and continue transection
            codeGen++;
            cart[itemCount] = new Product(codeGen, title, price, qty);
            itemCount++;
            System.out.println("Item " + itemCount + " Added");
            addProduct();
        }
    }

    public void printReceipt() {
        double totalDiscount=0, netTotal=0;
        System.out.println("====================================");
        System.out.println("============ RECEIPT ===============");
        System.out.println("====================================");
        System.out.println("ID    Title    Qty   Unit Price  Total");
        // For each item(Product object) in cart array, do..
        for (Product item : cart) {
            // Null check
            if (item != null) {
                String code = item.getCdCode();
                String name = item.getCdTitle();
                int qty = item.getBuyQuantity();
                double price = item.getUnitPrice();
                double totalPrice = qty * price;
                double discount = discount(qty, totalPrice);
                totalDiscount += discount;
                netTotal += totalPrice - discount;
                
                // Display the list
                System.out.println(code + "   "
                        + name + "    "
                        + qty + "    "
                        + price + "    "
                        + totalPrice);
                if(discount != 0) {
                    System.out.println(code + "   "
                        + name + "  "
                        + "- discount     "
                        + discount);
                }
            }
        }
        System.out.println("====================================");
        System.out.println("Total Discount         " + totalDiscount);
        System.out.println("Net total              " + netTotal);
        System.out.println("====================================");
    }

    private double discount(int qty, double totalPrice) {
        double discount;
        if(qty>=15) {
            discount = totalPrice*0.2;
        } else if(qty>=10) {
            discount = totalPrice*0.15; 
        } else if(qty>=5) {
            discount = totalPrice*0.1;
        } else {
            discount = 0;
        }
        return discount;
    }
    
    // Getter
    public int getItemCount() {
        return itemCount;
    }

    public boolean isAddNewItem() {
        return addNewItem;
    }

}
