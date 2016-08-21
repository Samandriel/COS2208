package tax;


/* @author harris
 */
public class Tax {

    public static void main(String[] args) {
        TaxCalculation person1 = new TaxCalculation();
        
        person1.inputData();
        person1.printReport();
    }

}
