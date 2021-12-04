import java.io.PrintStream;
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream p = System.out;

        p.print("ho va ten: ");
        String name = sc.nextLine();


        p.print("Nhap diem toan");
        double toan = Double.parseDouble(sc.nextLine());
        p.print("Nhap diem ly");
        double ly = Double.parseDouble(sc.nextLine());
        p.print("Nhap diem hoa");
        double hoa = Double.parseDouble(sc.nextLine());

        p.print("que quan: ");
        String address = sc.nextLine();

        p.println("ho va ten: " + name);
        p.println("ho va ten: " + address);
        p.println("diem toan " + toan);
        p.println("diem ly: " + ly);
        p.println("diem hoa: " + hoa);
        p.println("dtb: " + (double)((toan + ly + hoa)/3));
    }
}
