import java.util.Scanner;

public class CountNum {
    public static void Counting(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++ ){
            if(arr[i] > max) max = arr[i];
        }

        for(int i=1;i<=max;i++) {
            int count = 0;
            for(int j=0;j<arr.length;j++) {
                if(arr[j] == i){
                    count++;
                }
            }
            if(count != 0) System.out.printf("so %d xuat hien duoc %d lan\n", i, count);
        }
    }

    // 2 5 6 5 4 3 23 43 2 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr= new int[100];
        int input, temp = 0;

        System.out.println("nhap vao tu 1 den 100");
        do {
            input = sc.nextInt();
            if(input == 0) break;
            if(input < 1 || input > 100) {
                System.out.println("input phai la so tu 1 den 100");
            } else {
                arr[input]++;
            }
        }while(true);
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) System.out.printf("so %d xuat hien duoc %d lan\n", i, arr[i]);
        }
    }
}
