import java.util.Arrays;
import java.util.Scanner;

public class BtapArray1 {
    public static void Input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void Output(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void FindMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int temp = -1;
        for(int i=0;i< arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
                temp = i;
            }
        }
        System.out.printf("vi tri %d GTLN: %d\n", temp, max);
    }
    public static void FindSecondMax(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = 0, temp2=-1, temp1=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max1) {
                max2 = max1;
                temp2 = temp1;
                max1 = arr[i];
                temp1 = i;
            }else {
                if(arr[i] > max2) {
                    max2 = arr[i];
                    temp2 = i;
                }
            }
        }
        System.out.printf("vi tri %d GTLN thu 2: %d\n", temp2, max2);
    }


    public static void MinToMax(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j< arr.length;j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i< arr.length;i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void MaxToMin(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j< arr.length;j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] ChenCuoi(int[] arr, int temp) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static int[] ChenBatKi(int []arr, int temp, int index) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        if(index >= arr.length) index = arr.length - 1;
        if(index < 0) index = 0;
        for(int i=arr.length-1;i>index;i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = temp;
        return arr;
    }

    public static int[] RemoveLast(int[] arr) {
        arr = Arrays.copyOf(arr, arr.length - 1);
        return arr;
    }

    public static int[] RemovebatKi(int []arr, int index) {
        if(index >= arr.length) index = arr.length - 1;
        if(index < 0) index = 0;
        for(int i=index;i<arr.length-1;i++) {
            arr[i] = arr[i+1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1);
        return arr;
    }

    public static void FindSecondMin(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = 0, temp2=-1, temp1=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < min1) {
                min2 = min1;
                temp2 = temp1;
                min1 = arr[i];
                temp1 = i;
            }else {
                if(arr[i] < min2) {
                    min2 = arr[i];
                    temp2 = i;
                }
            }
        }
        System.out.printf("vi tri %d GTLN thu 2: %d\n", temp2, min2);
    }

    public static void TinhTongSoDauLe(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            int temp = arr[i], value = 0;
            if(arr[i] > 0 && arr[i] < 10) {
                if(arr[i] % 2 != 0) sum += arr[i];
            }else {
                while(temp != 0) {
                    value = temp % 10;
                    temp /= 10;
                }
                if(value % 2 != 0) {
                    sum += arr[i];
                }
            }
        }
        System.out.println(sum);
    }
    
    // 12 49 2 3 67 12 412 2 4 16
    // 1 11 20 32 40 99 80 88 32 7
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        Input(arr);
//        Output(arr);
//        FindMax(arr);
//        FindSecondMax(arr);
//        MinToMax(arr);
//        MaxToMin(arr);

            // chèn vào cuối
//        System.out.print("Nhap vao gia tri chen cuoi mang: ");
//        int temp = sc.nextInt();
//        int []tempArr = ChenCuoi(arr, temp);
//        Output(tempArr);

            // chèn vị trí bất kì
//        System.out.print("Nhap vao gia tri chen: ");
//        int temp = sc.nextInt();
//        System.out.print("Nhap vao vi tri chen: ");
//        int index = sc.nextInt();
//        int []tempArr = ChenBatKi(arr, temp, index);
//        Output(tempArr);

            // xoá cuối
//        int[] tempArr = RemoveLast(arr);
//        Output(tempArr);

            // xoá vị trí bất kì
//        System.out.print("Nhap vao vi tri xoa: ");
//        int index = sc.nextInt();
//        int []tempArr = RemovebatKi(arr, index);
//        Output(tempArr);

            // Tính tổng các số có chữ số đầu là số lẻ
//        TinhTongSoDauLe(arr);

            // tìm số nhỏ thứ 2 trong mảng
//        FindSecondMin(arr);

    }
}
