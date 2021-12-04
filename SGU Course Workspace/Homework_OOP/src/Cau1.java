import java.io.PrintStream;
import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream p = System.out;

        p.print("Put x, y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        p.println("x + y: " + ( x + y ));
        p.println("x - y: " + ( x - y ));
        p.println("x * y: " + ( x * y ));
        p.println("x / y: " + ( x / y ));
    }
}
