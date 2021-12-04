import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[10];
        System.out.print("Enter 10 number: ");
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        // 1 2 3 4 5 6 7 8 9 10
        System.out.print("Reverse Array: ");
        for (int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
