import java.util.Scanner;

public class ConverNumbertoDay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("input day: ");
        int day = sc.nextInt();
        String printDay = "";
        switch (day) {
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
                printDay = "Satuday";
                break;
            default:
                printDay = "Error";
                break;
        }
        System.out.println("Result: " + printDay);
    }
}
