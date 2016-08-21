package today;

/* @author harris
 */
public class Month extends Year {
// Month Constants
    private final String MONTH_1 = "January";
    private final String MONTH_2 = "Febuary";
    private final String MONTH_3 = "March";
    private final String MONTH_4 = "April";
    private final String MONTH_5 = "May";
    private final String MONTH_6 = "June";
    private final String MONTH_7 = "July";
    private final String MONTH_8 = "August";
    private final String MONTH_9 = "September";
    private final String MONTH_10 = "October";
    private final String MONTH_11 = "November";
    private final String MONTH_12 = "December";

    // Initialize fields
    public int monthNumber;
    public String month;
    public boolean month31;

    public String getMonth() {
        return month;
    }

    public void setMonth() {
        String monthName = "";

        System.out.print("Enter Month: ");
        monthNumber = input.nextInt();

        while (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Please enter month between 1-12");
            System.out.print("Enter Month: ");
            monthNumber = input.nextInt();
        }
        System.out.println("=======================");
        
        // months with 31 days
        switch (monthNumber) {
            case 1:
            case 3: 
            case 5:
            case 7: 
            case 8:
            case 10:
            case 12:
                month31 = true;
                break;
            default:
                month31 = false;
                
        }
        
        // Month name
        switch (monthNumber) {
            case 1:
                monthName = MONTH_1;
                break;
            case 2:
                monthName = MONTH_2;
                break;
            case 3:
                monthName = MONTH_3;
                break;
            case 4:
                monthName = MONTH_4;
                break;
            case 5:
                monthName = MONTH_5;
                break;
            case 6:
                monthName = MONTH_6;
                break;
            case 7:
                monthName = MONTH_7;
                break;
            case 8:
                monthName = MONTH_8;
                break;
            case 9:
                monthName = MONTH_9;
                break;
            case 10:
                monthName = MONTH_10;
                break;
            case 11:
                monthName = MONTH_11;
                break;
            case 12:
                monthName = MONTH_12;
                break;
        }

        this.month = monthName;
    }
}
