import java.io.PrintStream;
import java.util.Scanner;

public class Cau20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream p = System.out;

        p.println("Nhap vao ngay/thang/nam: ");
        int day = Integer.parseInt(sc.nextLine());
        int month = Integer.parseInt(sc.nextLine());
        int year = Integer.parseInt(sc.nextLine());


        if(month < 3) {
            month += 12;
            year -= 1;
        }

        int n = (day + 2*month + (3*(month + 1))/5 + year + (year/4)) % 7;

        String printDay = "";
        switch (n) {
            case 0:
                printDay = "Sunday";
                break;
            case 1:
                printDay = "Monday";
                break;
            case 2:
                printDay = "Tuesday";
                break;
            case 3:
                printDay = "Wednesday";
                break;
            case 4:
                printDay = "Thursday";
                break;
            case 5:
                printDay = "Friday";
                break;
            case 6:
                printDay = "Saturday";
                break;
            default:
                break;
        }

        p.print("Hom nay la thu: " + printDay);
    }
}
