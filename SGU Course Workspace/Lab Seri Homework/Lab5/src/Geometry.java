import java.util.Scanner;
/**
 This program demonstrates static methods
 */

public class Geometry {
    public static void printMenu() {
        System.out.println("This is a geometry calculator");
        System.out.println("This is a geometry calculator");
        System.out.println("1. Find the area of a circle\n" +
                "2. Find the area of a rectangle\n" +
                "3. Find the area of a triangle\n" +
                "4. Find the circumference of a circle\n" +
                "5. Find the perimeter of a rectangle\n" +
                "6. Find the perimeter of a triangle\n");
        System.out.print("Enter the number of your choice: ");
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double rectangleArea(double width, double length) {
        return length * width;
    }

    public static double triangleArea(double base, double height) {
        return 1.0/2 * base * height;
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double trianglePerimeter(double a, double b, double c){
        return a + b + c;
    }

    public static void main(String[] args) {
        int choice; // The user's choice
        char letter = 0; // The user's Y or N decision
        double radius; // The radius of the circle
        double length; // The length of the rectangle
        double width; // The width of the rectangle
        double height; // The height of the triangle
        double base; // The base of the triangle
        double side1; // The first side of the triangle
        double side2; // The second side of the triangle
        double side3; // The third side of the triangle

        // task 1
        printMenu();

        do {
            // TASK #1 Call the printMenu method
            choice = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the radius of the circle: "); radius = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.println("The area of the circle is " + circleArea(radius));
                }

                case 2 -> {
                    System.out.print("Enter the length of the rectangle: "); length = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.print("Enter the width of the rectangle: "); width = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.println("The area of the rectangle is " + rectangleArea(width, length));
                }

                case 3 -> {
                    System.out.print("Enter the height of the triangle: "); height = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.print("Enter the base of the triangle: "); base = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.println("The area of the triangle is " + triangleArea(base, height));
                }

                case 4 -> {
                    System.out.print("Enter the radius of the circle: "); radius = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.println("The circumference of the circle is " + circleCircumference(radius));
                }

                case 5 -> {
                    System.out.print("Enter the length of the rectangle: "); length = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.print("Enter the width of the rectangle: "); width = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.println("The perimeter of the rectangle is " + rectanglePerimeter(length, width));
                }

                case 6 -> {
                    System.out.print("Enter the length of side 1 of the triangle: "); side1 = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.print("Enter the length of side 2 of the triangle: "); side2 = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.print("Enter the length of side 3 of the triangle: "); side3 = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.println("The perimeter of the triangle is " + trianglePerimeter(side1, side2, side3));
                }

                default -> {
                    System.out.println("You did not enter a valid choice.");
                    System.out.print("Do you want to exit the program (Y/N)?: "); String answer = new Scanner(System.in).nextLine();
                    letter = answer.charAt(0);
                }
            }
        } while (letter != 'Y' && letter != 'y');
    }
}