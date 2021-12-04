import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double  highestScore = 0;
        String MVPname = "";

        System.out.print("Nhap vao so luong hoc sinh: ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++) {
            System.out.print("ten sinh vien: ");
            String name  = sc.next();
            System.out.print("diem so: ");
            double score = sc.nextDouble();

            if(score > highestScore) {
                MVPname = name;
                highestScore = score;
            }

        }
        System.out.printf("Svien ten %s co diem so cao nhat la %.2f", MVPname, highestScore);
    }
}
