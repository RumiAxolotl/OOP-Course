import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price, tax, total;
        final double TAX_RATE = 0.055;
        String item;

        // Display prompts and get input.
        System.out.print("Item description: ");
        item = sc.nextLine();
        System.out.print("Item price: $");
        price = sc.nextDouble();

        tax = price * TAX_RATE;
        total = price + tax;

        // Display the results.
        System.out.println(item + " $" + price);
        System.out.println("Tax $" + tax);
        System.out.println("Total $" + total);
    }
}
