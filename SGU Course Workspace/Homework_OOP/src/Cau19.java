import java.io.PrintStream;
import java.util.Scanner;

public class Cau19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream p = System.out;

        p.print("Nhap vao a: ");
        double a = Double.parseDouble(sc.nextLine());
        p.print("Nhap vao b: ");
        double b = Double.parseDouble(sc.nextLine());
        p.print("Nhap vao c: ");
        double c = Double.parseDouble(sc.nextLine());

        if(a == 0) {
            if(b == 0){
                if(c == 0) {
                    p.println("Vo so nghiem");
                }else {
                    p.println("Vo nghiem");
                }
            }else {
                p.println("nghiem x= " + (-c/b));
            }
        }else {
            double delta = b*b - 4*a*c;
            double x1,x2;
            if (delta > 0) {
                x1 = (float)((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float)((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phương trình có 2 nghiệm là: x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }
}
