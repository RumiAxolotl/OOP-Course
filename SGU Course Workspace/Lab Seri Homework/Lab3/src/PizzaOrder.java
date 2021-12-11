import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        // Create a Scanner Object to read input
        Scanner sc = new Scanner(System.in);

        final double TAX_RATE = 0.08;
        int inches, numberOfToppings = 0;
        double cost = 12.99;
        double tax;
        boolean discount = false;
        char crustType, choice;
        String firstName, input;
        String crust = "Hand-tossed"; //default option
        String toppings = "Cheese "; //default option

        // Prompt user and get first name.
        System.out.println("Welcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name: ");
        firstName = sc.nextLine();
        firstName = firstName.toLowerCase();

        // Determine if user is eligible for discount by having the same first name as one of the owners.
        // ADD LINES HERE FOR TASK #1
        if(firstName.equals("Mike".toLowerCase())  || firstName.equals("Diane".toLowerCase())) {
            discount = true;
        }

        // Prompt user and get pizza size choice.
        System.out.println("Pizza Size (inches) Cost");
        System.out.println(" 10 $10.99");
        System.out.println(" 12 $12.99");
        System.out.println(" 14 $14.99");
        System.out.println(" 16 $16.99");
        System.out.println("What size pizza would you like?");
        System.out.print("10, 12, 14, or 16 (enter the number only): ");
        inches = sc.nextInt();

        // Set price and size of pizza ordered.
        // ADD LINES HERE FOR TASK #2
        if(inches == 10 || inches == 12 || inches == 14 || inches == 16) {
            switch (inches) {
                case 10:
                    cost = 10.99;
                    break;
                case 12:
                    cost = 12.99;
                    break;
                case 14:
                    cost = 14.99;
                    break;
                case 16:
                    cost = 16.99;
                    break;
                default:
                    break;
            }
        } else  {
            System.out.print("We don't have this option !\nGet the fuck out of here");
            return;
        }

        // Consume the remaining newline character.
        sc.nextLine();

        // Prompt user and get crust choice.
        System.out.println("What type of crust do you want? ");
        System.out.print("(H)Hand-tossed, " +
                "(T) Thin-crust, or " +
                "(D) Deep-dish " +
                "(enter H, T, or D): ");
        input = sc.nextLine();
        crustType = input.charAt(0);

        // Set user's crust choice on pizza ordered.
        // ADD LINES FOR TASK #3
        switch (crustType) {
            case 'h':
                crust = "Hand-tossed";
                break;
            case 't':
                crust = "Thin-crust";
                break;
            case 'd':
                crust = "Deep-dish";
                break;
            default:
                crust = "Hand-tossed";
                break;
        }

        // Prompt user and get topping choices one at a time.
        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each, choose from:");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom");
        // If topping is desired, add to topping list and number of toppings

        System.out.print("Do you want Pepperoni? (Y/N): ");
        input = sc.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";
        }

        System.out.print("Do you want Sausage? (Y/N): ");
        input = sc.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Sausage ";
        }

        System.out.print("Do you want Onion? (Y/N): ");
        input = sc.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Onion ";
        }

        System.out.print("Do you want Mushroom? (Y/N): ");
        input = sc.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Mushroom ";
        }

        // Add additional toppings cost to cost of pizza.
        cost = cost + (1.25 * numberOfToppings);

        // Display order confirmation.
        System.out.println();
        System.out.println("Your order is as follows: ");
        System.out.println(inches + " inch pizza");
        System.out.println(crust + " crust");
        System.out.println(toppings);

        // Apply discount if user is eligible.
        // ADD LINES FOR TASK #4 HERE
        if(discount) {
            int discount_reduce = 2;
            cost = cost - discount_reduce;
            System.out.printf("Congratulations you got 2$ off because you deserve it\nYour total cost after reduce $%f",cost);
        } else {
            System.out.printf("The cost of your order is: $%f\n", cost);
        }
        // EDIT PROGRAM FOR TASK #5
        // SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
        // Calculate and display tax and total cost.
        tax = cost * TAX_RATE;
        System.out.printf("The tax is: $%f\n", tax);
        System.out.printf("The total due is: $%f\n", (tax + cost));
        System.out.println("Your order will be ready for pickup in 30 minutes.");
    }
}
