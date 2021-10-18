class Dated {
    private int day;
    private int month;
    private int year;

    public Dated(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDated(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void display() {
        String day = this.day + "";
        String month = this.month + "";
        String year = this.year + "";
        if(day.length() == 1) {
            day = "0" + day;
        }
        if(month.length() == 1) {
            month = "0" + month;
        }

        System.out.println(day + "/" + month + "/" + year);
    }
}

public class Date {
    public static void main(String[] args) {
        Dated d = new Dated(1, 1, 1997);
        d.display();
        d.setDated(12, 12, 2004);
        d.display();
        d.setMonth(3);
        d.display();
    }
}
