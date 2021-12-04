import java.io.PrintStream;
import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream p = System.out;
        p.print("nhap n: ");
        int number = sc.nextInt();
        p.println(number%2==0 ? "so chan" : "so le");
    }
}
