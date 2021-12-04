import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Nhanvien {
    private String id;
    private String name;
    private int YearWorking;
    private double HesoLuong;
    private int RestDay;
    static int LuongCoBan = 1150;

    public Nhanvien() {}

    public Nhanvien(String id, String name, int yearWorking, double hesoLuong, int restDay) {
        this.id = id;
        this.name = name;
        this.YearWorking = yearWorking;
        this.HesoLuong = hesoLuong;
        this.RestDay = restDay;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearWorking() {
        return YearWorking;
    }

    public double getHesoLuong() {
        return HesoLuong;
    }

    public int getRestDay() {
        return RestDay;
    }

    public double getLuongCoBan() {
        return LuongCoBan;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearWorking(int yearWorking) {
        YearWorking = yearWorking;
    }

    public void setHesoLuong(double hesoLuong) {
        HesoLuong = hesoLuong;
    }

    public void setRestDay(int restDay) {
        RestDay = restDay;
    }

    public void setCurrentYear(int currentYear) {
        CurrentYear = currentYear;
    }

    Calendar instance = Calendar.getInstance();
    int CurrentYear = instance.get(Calendar.YEAR);

    public double PhuCap() {
        return CurrentYear - YearWorking >= 5 ? (CurrentYear - getYearWorking()) * LuongCoBan/100.0 : 0;
    }

    public char Ranking() {
        if(RestDay <= 1) return 'A';
        if(RestDay > 3) return 'C';
        return 'B';
    }

    public double LuongNhanVien() {
        double HeSoThiDua = 0;
        if(Ranking() == 'A') HeSoThiDua = 1.0;
        if(Ranking() == 'B') HeSoThiDua = 0.75;
        if(Ranking() == 'C') HeSoThiDua = 0.5;

        return LuongCoBan * HesoLuong * HeSoThiDua + PhuCap();
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-12d %-12.2f %-12d %-12c %-12.2f %-12.2f", getId(), getName(), getYearWorking(), getHesoLuong(),
                getRestDay(), Ranking(), PhuCap(), LuongNhanVien());
    }

    public void input() {
        System.out.print("Nhap ma nhan vien: "); id = new Scanner(System.in).nextLine();
        System.out.print("Nhap vao ten nhan vien: "); name = new Scanner(System.in).nextLine();
        System.out.print("Nhap nam vao lam: "); YearWorking = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Nhap vao he so luong: "); HesoLuong = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.print("Nhap so ngay nghi: "); RestDay = Integer.parseInt(new Scanner(System.in).nextLine());
    }

    public void output() {
        System.out.format("%-10s %-20s %-12s %-12s %-12s %-12s %-12s %-12s\n",
                "Ma NV", "Ten Nhan Vien", "Nam", "HSL", "Day off", "Rank", "PhuCap", "Luong");
        System.out.println("===============================================================" +
                "================================================");
        System.out.println(toString());
    }
}
