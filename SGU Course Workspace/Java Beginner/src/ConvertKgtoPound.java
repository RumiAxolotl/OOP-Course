import java.util.Scanner;

public class ConvertKgtoPound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so kg: ");
        double kg = sc.nextDouble();
        double po = 2.2;
        for(int i=1;i<kg;i++) {
            System.out.printf("%dkg = %.2f pound\n",i , po * i);
        }
    }
}
