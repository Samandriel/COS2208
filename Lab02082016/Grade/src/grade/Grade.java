package grade;

/* Lab06
 * @author harris
 */

public class Grade {

    public static void main(String[] args) {
        
        GradeCalculation student1 = new GradeCalculation();
        
        student1.setAttentionScore();
        student1.setAssignmentScore();
        student1.setExamScore();
        student1.grading();
    }

}
