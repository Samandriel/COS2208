package today;

/* @author harris
 */
public class Year extends DataIO {
    public int year;
    public boolean leapYear;
    
    public int getYear() {
        return year;
    }

    public void setYear() {
        System.out.print("Enter year(Buddhist Carlendar): ");
        int yearInput = input.nextInt();

        // Input limit
        while (yearInput < 1 || yearInput > 9999) {
            System.out.println("Please enter year between 0-9999");
            System.out.print("Enter year(Buddhist Carlendar): ");
            yearInput = input.nextInt();
        }

        this.year = yearInput;

        // Find Leap Year
        int yearInAD = year - 543;

        if (yearInAD % 400 == 0 || yearInAD % 4 == 0 && yearInAD % 100 != 0) {
            leapYear = true;
            System.out.println(year + " or " + yearInAD + " is a leap year");
        } else {
            leapYear = false;
            System.out.println(year + " or " + yearInAD + " is not a leap year");
        }
        System.out.println("=======================");
    }
}
