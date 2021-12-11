import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        // TASK #2 Create a Scanner object here
        Scanner sc = new Scanner(System.in);

        final int NUMBER = 2 ; // Number of scores
        final int SCORE1 = 100; // First test score
        final int SCORE2 = 95; // Second test score
        final int BOILING_IN_F = 212; // Boiling temperature
        double fToC; // Temperature Celsius
        double average; // Arithmetic average

        // Find an arithmetic average.
        System.out.println("Task 1");
        average = (double)(SCORE1 + SCORE2) / NUMBER;
        String outputScore = SCORE1 + " and " + SCORE2 + " have an average of " + average;
        System.out.println(outputScore);

        // Convert Fahrenheit temperature to Celsius.
        fToC = (5.0/9) * (BOILING_IN_F - 32);
        String outputFtoC = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
        System.out.println(outputFtoC);
        System.out.println(); // To leave a blank line

        // ADD LINES FOR TASK #2 HERE
        System.out.println("Task 2");
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(); // To leave a blank line

        // ADD LINES FOR TASK #3 HERE
        char firstInitial = firstName.charAt(0);
        System.out.println("Task 3");
        System.out.println(firstInitial);
        System.out.println(fullName.toUpperCase());
        System.out.print(fullName.length());
        System.out.println(); // To leave a blank line

        // ADD LINES FOR TASK #4 HERE
        System.out.println("Task 4");
        double pi = Math.PI;
        double radius = sc.nextDouble();

        double res = (4.0/3) * pi * Math.pow(radius, 3);
        System.out.println(res);
    }
}
