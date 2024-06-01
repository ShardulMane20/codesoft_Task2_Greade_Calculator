import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student Grades Calculator\n\n");
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();

        int[] marks = new int[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double ap = (double) totalMarks / numberOfSubjects;

        char grade = calculateGrade(ap);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + ap + "%");
        System.out.println("Grade: " + grade);


    }

    public static char calculateGrade(double ap) {
        if (ap >= 90) {
            return 'A';
        } else if (ap >= 80) {
            return 'B';
        } else if (ap >= 70) {
            return 'C';
        } else if (ap >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
