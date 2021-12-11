import java.lang.reflect.Array;
import java.util.Scanner;

public class Average {
    private int[] data;
    private double mean;

    public Average() {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<data.length;i++) {
            System.out.print("Enter Number " + (i+1) + ": ");
            data[i] = sc.nextInt();
        }
        calculateMean();
        selectionSort();
    }

    public void calculateMean() {
        int total = 0;
        for(int i=0;i<data.length;i++) {
            total += data[i];
        }
        mean = total/(data.length);
    }

    public String toString() {
        String EmptyObj = "";
        for(int i=0;i<data.length;i++) {
            EmptyObj += i + ": " + data[i] + "\n";
        }
        EmptyObj += "Mean: " + mean;
        return EmptyObj;
    }

    public void selectionSort() {
        int temp, min_value;
        for(int i=0;i<data.length-1;i++) {
            min_value = i;
            for(int j=i+1;j<data.length;j++){
                if(data[min_value] > data[j]) min_value = j;
            }
            temp = data[i];
            data[i] = data[min_value];
            data[min_value] = temp;
        }
    }
}
