import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char Continue;

        do {
            System.out.println("Enter marks obtained (out of 100):");
            int marks = scanner.nextInt();
            String grade;

            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 80) {
                grade = "B";
            } else if (marks >= 70) {
                grade = "C";
            } else if (marks >= 60) {
                grade = "D";
            } else {
                grade = "F (Fail)";
            }

            System.out.println("Grade: " + grade);
            System.out.println("Check another result? (Y/N):");
            Continue = scanner.next().charAt(0);
        } while (Continue == 'Y');

        
    }
}
