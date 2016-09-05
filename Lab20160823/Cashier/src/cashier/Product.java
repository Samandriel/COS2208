package cashier;

/* @author harris
 */
public class Product {
    
    private final String cdCode;
    private final String cdTitle;
    private final double unitPrice;
    private final int buyQuantity;

    public Product(int codeGen, String title, double price, int qty) {
        cdCode = String.format("%05d", codeGen);
        cdTitle = title;
        unitPrice = price;
        buyQuantity = qty;
    }
    
    
    

    // Getter
    public String getCdCode() {
        return cdCode;
    }

    public String getCdTitle() {
        return cdTitle;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    
    public int getBuyQuantity() {
        return buyQuantity;
    }
    
}
