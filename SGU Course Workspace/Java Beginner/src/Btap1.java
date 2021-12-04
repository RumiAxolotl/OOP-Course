import java.util.Scanner;

public class Btap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double radius = sc.nextDouble();
        double s = 2 * radius * Math.sin(Math.PI / 5);
        double area = (5.0 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("ket qua: %.2f", area);
    }
}
