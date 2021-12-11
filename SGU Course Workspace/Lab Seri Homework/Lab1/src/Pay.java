import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hours, rate, pay;
        System.out.print("How many hours did you work: ");
        hours = sc.nextDouble();
        System.out.print("How much are you paid per hour: ");
        rate = sc.nextDouble();

        pay = hours <= 40 ? hours * rate : (hours - 40) * (1.5 * rate) + (40 * rate);
        System.out.println("Your balance increase = " + pay);
    }
}
