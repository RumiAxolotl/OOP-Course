import java.util.Scanner;

public class Cau23 {
    public static boolean isNamNhuan(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
             return true;
        }else {
            return false;
        }
    }

    public static int DayofMonth(int month, int year) {
        int totalDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                totalDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                totalDays = 30;
                break;
            case 2:
                totalDays = isNamNhuan(year) ?  29 : 28;
                break;
        }
        return totalDays;
    }

    public static void getDayBefore(int day, int month, int year) {
        day--;
        if(day == 0) {
            month--;
            if(month == 0){
                month = 12;
                year--;
            }

            day = DayofMonth(month, year);
        }

        System.out.println("The day before is: "+ day + "/" + month + "/" + year);
    }

    public static void getDayAfter(int day, int month, int year) {
        day++;
        if(day > DayofMonth(month, year)) {
            day = 1;
            month++;
            if(month > 12) {
                month = 1;
                year++;
            }
        }
        System.out.println("The day after is: "+ day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, month, year;

        System.out.println("Nhap vao ngay/thang/nam: ");
        day = Integer.parseInt(sc.nextLine());
        month = Integer.parseInt(sc.nextLine());
        year = Integer.parseInt(sc.nextLine());


        if((day < 1 || day > 31)) {
            System.out.println("nhap sai ngay ! nhap lai");
            return;
        }
        if((month < 1 || month > 12)) {
            System.out.println("nhap sai thang ! nhap lai");
            return;
        }

        if((day >= 1 && day <= DayofMonth(month, year))) {
            getDayBefore(day, month, year);
            getDayAfter(day, month, year);
        } else {
            System.out.println("ngay nhap vao ko hop le!\nXin kiem tra lai");
        }
    }

}
