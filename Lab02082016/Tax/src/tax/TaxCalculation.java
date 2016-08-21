package tax;

import java.util.Scanner;

/* @author harris
 */
public class TaxCalculation {
    Scanner input = new Scanner(System.in);
    
    private double salary, bonus, insurance;
    private double income;
    private double personalExpenses, childCare;
    private double expenses, EBT, tax, netIncome;
    private int child;
    
    public void inputData() {
        System.out.print("Enter Monthly Salary: ");
        salary = input.nextDouble();
        System.out.print("Enter Bonus: ");
        bonus = input.nextDouble();
        System.out.print("Enter Insurance Expenses: ");
        insurance = input.nextDouble();
        System.out.print("How many child do you have? (Age under 20): ");
        child = input.nextInt();
    }
    
    public void calculateTax() {     
        // Income
        income = (salary*12)+bonus;
        
        // Expenses
        personalExpenses = income*0.3;
        if (personalExpenses > 60_000) {
            personalExpenses = 60_000;
        }
        
        if (insurance > 100_000) {
            insurance = 100_000;
        }
        
        childCare = 13000 * child;
        
        expenses = personalExpenses + insurance + childCare;
        
        // Earning Before Tax
        EBT = income - expenses;
 
        if (EBT >= 200_000 && EBT < 500_000) {
            tax = EBT*.10;
        } else if (EBT >= 500_000 && EBT < 1_000_000) {
            tax = EBT*0.15;
        } else if (EBT >= 1_000_000) {
            tax = EBT*0.20;
        } else {
            tax = 0;
        }
        
        // Net Income
        netIncome = EBT - tax;
    }
    
    public void printReport() {
        calculateTax();
        System.out.println("\n\n==============================");
        System.out.println("++++++++++++INCOME++++++++++++");
        System.out.println("Anual Salary       " + salary);
        System.out.println("Bonus              " + bonus);
        System.out.println("-------------------------------");
        System.out.println("TOTAL INCOME       " + income);
        System.out.println("-------------------------------");
        
        System.out.println("\n++++++++++++EXPENSES+++++++++++");
        System.out.println("Personal           " + personalExpenses);
        System.out.println("insurance          " + insurance);
        System.out.println("Child Care(" + child + ")      " + childCare);
        System.out.println("-------------------------------");
        System.out.println("TOTAL EXPENSES     " + expenses);
        System.out.println("-------------------------------\n");
        System.out.println("==============================");
        System.out.println("EARNING BEFORE TAX " + EBT);
        System.out.println("Tax                " + tax);
        System.out.println("==============================");
        System.out.println("NET INCOME         " + netIncome);
        System.out.println("==============================");
    }
    
    
}
