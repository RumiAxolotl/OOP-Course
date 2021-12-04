import java.io.PrintStream;
import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream p = System.out;

        p.print("Put width and length: ");
        double width = sc.nextDouble();
        double length = sc.nextDouble();

        p.println("Chu vi: " + ((width + length) * 2));
        p.println("Dien tich: " + (width * length));
    }
}
