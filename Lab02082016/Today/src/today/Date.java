package today;

/* @author harris
 */
public class Date extends Month {
    int date;

    public int getDate() {
        return date;
    }

    public void setDate() {
        System.out.print("Enter Date: ");
        int dateInput = input.nextInt();

        if (leapYear == true && monthNumber == 2) {
            do {
                System.out.println(year + " is a leap year. " + month + " last date must be 29th");
                System.out.print("Enter Date: ");
                dateInput = input.nextInt();
            } while (dateInput < 1 || dateInput > 29);
        } else if (leapYear == false && monthNumber == 2) {
            do {
                System.out.println(year + " is not a leap year. " + month + " last date must be 28th");
                System.out.print("Enter Date: ");
                dateInput = input.nextInt();
            } while (dateInput < 1 || dateInput > 28);
        } else if (month31 == true) {
            do {
                System.out.println(month + " last date must be 31th");
                System.out.print("Enter Date: ");
                dateInput = input.nextInt();
            } while (dateInput < 1 || dateInput > 31);
        } else {
            do {
                System.out.println(month + " last date must be 30th");
                System.out.print("Enter Date: ");
                dateInput = input.nextInt();
            } while (dateInput < 1 || dateInput > 31);
        }
        System.out.println("=======================");
        
        this.date = dateInput;
    }

}
