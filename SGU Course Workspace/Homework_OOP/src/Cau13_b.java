import java.util.Scanner;

public class Cau13_b {
    public static long giaithua(int num) {
        long sum = 1;
        for(int i=1;i<=num;i++) {
            sum*=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n;

        do {
            System.out.print("x: ");
            x = sc.nextInt();
            if(x < 1 || x > 50){
                System.out.println("Nhap sai! nhap lai\n 1<=x<=50");
            }
        }while(x < 1 || x > 50);

        System.out.print("n: ");
        n = sc.nextInt();

        float sum = 0;
        for(int i=1;i<=n;i++) {
            sum += Math.pow(x,i)/giaithua(x+i);
        }
        System.out.printf("result: %f", sum);
    }
}
