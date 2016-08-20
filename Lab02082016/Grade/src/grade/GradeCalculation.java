package grade;

import java.util.Scanner;

/* @author harris
 */
public class GradeCalculation {
    
    // Initialize constants
    private final int MAX_SCORE = 100;
    private final int MIN_SCORE = 0;
    private final int MAX_ATTENTION = 20;
    private final int MIN_ATTENTION = 0;
    private final int MAX_ASSIGNMENT = 30;
    private final int MIN_ASSIGNMENT = 0;
    private final int MAX_EXAM = 50;
    private final int MIN_EXAM =0;
    
    // Initialize fields
    private int attentionScore;
    private int assignmentScore;
    private int examScore; 
    
    // Initialize Input Object
    Scanner input = new Scanner(System.in);
    
    // Grading Method
    public void grading() {
        int totalScore = attentionScore + assignmentScore + examScore;
        System.out.println("Attention Score: " + getAttentionScore());
        System.out.println("Assignment score: " + getAssignmentScore());
        System.out.println("Exam score: " + getExamScore());
        System.out.println("----------------------------");
        System.out.println("Total Score is: " + totalScore);
        System.out.println("============================");
        
        
        if (totalScore >= 90) {
            System.out.println("Grade: A");
        } else if (totalScore >= 80) {
            System.out.println("Grade: B");
        } else if (totalScore >= 70) {
            System.out.println("Grade: C");
        } else if (totalScore >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        System.out.println("============================");
    }
    
    // Attention Score
    public int getAttentionScore() {
        return attentionScore;
    }

    public void setAttentionScore() {
        int attention;
        
        do {
            System.out.println("Attention score betweens " + MIN_ATTENTION + "-" + MAX_ATTENTION);
            System.out.print("Enter Attention Score: ");
            attention = input.nextInt();
        } while (attention < MIN_ATTENTION || attention > MAX_ATTENTION);
        
        this.attentionScore = attention;
        System.out.println("Attention Score: " + getAttentionScore());
        System.out.println("============================");
    }

    
    // Assingment Score
    public int getAssignmentScore() {
        return assignmentScore;
    }

    public void setAssignmentScore() {
        int assignment;
        
        do {
            System.out.println("Assignment score betweens " + MIN_ASSIGNMENT + "-" + MAX_ASSIGNMENT);
            System.out.print("Enter Assignment score: ");
            assignment = input.nextInt();
        } while (assignment < MIN_ASSIGNMENT || assignment > MAX_ASSIGNMENT);
        
        this.assignmentScore = assignment;
        System.out.println("Assignment score: " + getAssignmentScore());
        System.out.println("============================");
    }

    
    // Exam Score
    public int getExamScore() {
        return examScore;
    }

    public void setExamScore() {
        int exam;
        
        do {
            System.out.println("Exam score betweens " + MIN_EXAM + "-" + MAX_EXAM);
            System.out.print("Enter Exam score: ");
            exam = input.nextInt();
        } while (exam < MIN_EXAM || exam > MAX_EXAM);
        
        this.examScore = exam;
        System.out.println("Assignment score: " + getExamScore());
        System.out.println("============================");
    }
    
}
