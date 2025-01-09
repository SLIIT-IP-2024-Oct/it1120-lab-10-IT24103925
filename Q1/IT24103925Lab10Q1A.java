import java.util.Scanner;

public class IT24103925Lab10Q1A {
    public static void main(String[] args) {
        // Enable assertions at runtime by using the JVM argument: -ea

        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a mark
        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();
        
        // Use an assertion to check if the mark is within the valid range (0-100)
        assert mark >= 0 && mark <= 100 : "Invalid Mark";
        
        // Determine the letter grade based on the mark
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Use an assertion to check if the grade assigned is correct
        assert (grade == 'A' && mark >= 75) || 
               (grade == 'B' && mark >= 60 && mark < 75) ||
               (grade == 'C' && mark >= 50 && mark < 60) ||
               (grade == 'D' && mark >= 40 && mark < 50) ||
               (grade == 'F' && mark < 40) : "Incorrect Grade Assigned";
        
        // Print the grade and validation message
        System.out.println("Mark is Validated");
        System.out.println("Assigned Grade: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}
