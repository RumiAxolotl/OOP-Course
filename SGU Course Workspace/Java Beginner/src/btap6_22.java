import java.util.Scanner;

public class btap6_22 {
    public static double sqrt(long n) {
        double lastGuess, nextGuess = 1;
        lastGuess = nextGuess;
        nextGuess = (lastGuess + (double)n / lastGuess) / 2;

        while (Math.abs(lastGuess - nextGuess) >= 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (double)n / lastGuess) / 2;
        }

        return nextGuess;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input n: ");
        long n = sc.nextLong();
        System.out.println("result is: " + sqrt(n));
    }
}
