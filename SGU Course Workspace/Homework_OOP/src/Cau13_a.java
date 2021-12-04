import java.util.Scanner;

public class Cau13_a {
    public static long giaithua(int num) {
        long sum = 1;
        for(int i=1;i<=num;i++) {
            sum*=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n: ");
        double num = sc.nextLong();
        double sum = 2021;
        for(int i=2;i<=num;i++) {
            sum += Math.pow(-1.0, i)/giaithua(i);
        }
        System.out.printf("result: %f", sum);
    }
}
