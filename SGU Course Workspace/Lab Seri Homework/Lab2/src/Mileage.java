import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your Miles Driven: "); double totalMiles = sc.nextDouble();
        System.out.print("input your Gallons Used: "); double totalGallons = sc.nextDouble();

        if(totalMiles <= 0) totalMiles = 0;

        double MilesPerGallons = totalMiles / totalGallons;
        System.out.println("Your Miles Per Gallons is " + MilesPerGallons);
    }
}
