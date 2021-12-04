import java.util.Scanner;

public class lowestCase {

    public static void convertToUpperCase(char x) {
        if((int)x >= 65 && (int)x <= 90) {
            System.out.println((char)(x + 32));
        } else {
            System.out.println("ko the chuyen doi chu hoa thanh chu thuong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ki tu: ");
        char c = sc.nextLine().charAt(0);

        convertToUpperCase(c);
    }
}
