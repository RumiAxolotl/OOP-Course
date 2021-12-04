import java.util.Scanner;

public class PaymentOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so tien gui: ");
        double amount = sc.nextDouble();
        System.out.print("Nhap vao so nam gui: ");
        int year = sc.nextInt();

        double interestRate;
        if(year >= 7 && year < 15) {
            interestRate = 0.0725;
        }else if(year >= 15 && year < 30) {
            interestRate = 0.085;
        }else if(year >= 30){
            interestRate = 0.09;
        }else {
            interestRate = 0;
        }

        double monnthlyPayment = amount * interestRate/12;
        System.out.println("Monthly Paymet: " + monnthlyPayment);
    }
}
