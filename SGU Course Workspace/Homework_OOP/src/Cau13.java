import java.util.Scanner;

public class Cau13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, temp;

        // 1 10 99 999 -120 -40 21 42 67 86
        System.out.print("hay nhap 1 day so bat ki: ");
        for(int i=0;i<n;i++) {
            temp = sc.nextInt();
            if(temp > max) max = temp;
            if(temp < min) min = temp;
        }
        System.out.printf("max: %d, min: %d", max, min);
    }
}
