package grade;


/* @author harris
 */
public class Grade {

    public static void main(String[] args) {
        
        GradeCalculation student = new GradeCalculation();
        
        student.inputData(); 
        System.out.print("If you like to do more, please press 9. Any otherwise will end: ");
        int continueProcess = student.input.nextInt();
        
        while (continueProcess == 9) {
            student.inputData();
            System.out.print("If you like to do more, please press 9. Any otherwise will end: ");
            continueProcess = student.input.nextInt();
        }
    }

}
