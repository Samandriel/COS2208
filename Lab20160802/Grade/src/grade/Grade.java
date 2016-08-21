package grade;

/* Lab06
 * @author harris
 */

public class Grade {

    public static void main(String[] args) {
        
        GradeCalculation student = new GradeCalculation();
        
        student.setAttentionScore();
        student.setAssignmentScore();
        student.setExamScore();
        student.grading();
    }

}
