import java.util.Scanner;

public class Cau12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n: ");
        int n = sc.nextInt();

        int result = 0;
        int opt = (n % 2 == 0) ? 2 : 1;
        for(int i=opt;i<=n;i+=2) {
            result += i;
        }
        System.out.printf(opt == 2 ?"tong chan: %d" : "tong le: %d", result);
    }
}
