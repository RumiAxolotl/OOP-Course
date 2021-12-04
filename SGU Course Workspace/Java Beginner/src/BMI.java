import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Can Nang:");
        double CanNang = sc.nextDouble();

        System.out.print("Chieu cao:");
        double ChieuCao = sc.nextDouble();

        double BMIcs = CanNang/(ChieuCao*ChieuCao);

        if(BMIcs < 18.5){
            System.out.println("Underweight");
        }else if(BMIcs < 25) {
            System.out.println("Normal");
        }else if(BMIcs < 30) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
