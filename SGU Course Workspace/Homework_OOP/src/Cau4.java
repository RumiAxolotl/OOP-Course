import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream p = System.out;
        p.print("nhap vao ban kinh: ");
        double r = sc.nextDouble();

        double chuvi = 2 * Math.PI * r;
        double dientich = Math.pow(r, 2) * Math.PI;

        p.printf("Chu vi: %.2f", (float)(chuvi));
        p.printf("\nDien tich: %.2f",  (float)(dientich));
    }
}
