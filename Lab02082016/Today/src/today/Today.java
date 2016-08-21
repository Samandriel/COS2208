package today;

/* @author harris
 */
public class Today {
    
    public static void main(String[] args) {
        
        Date day1 = new Date();
   
        day1.setYear();
        day1.setMonth();
        day1.setDate();
        
        // Output
        int date = day1.getDate();
        String month = day1.getMonth();
        int year = day1.getYear();
        System.out.println("=======================");
        System.out.println("Result: " + date + " " + month + " " + year);
        System.out.println("=======================");
    }
    
}
