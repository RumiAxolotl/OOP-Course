import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberA = (int)(Math.random() * 10);
        int numberB = (int)(Math.random() * 10);

        int result = numberA > numberB ? numberA - numberB : numberB - numberA;
        int test = sc.nextInt();

        System.out.println(result);
        if(test == result){
            System.out.println("Dung");
        }else {
            System.out.println("Sai");
        }
    }
}
