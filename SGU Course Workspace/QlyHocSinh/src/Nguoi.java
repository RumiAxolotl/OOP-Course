import java.util.Scanner;

public class Nguoi {
    private String HovaTen;
    private int age;
    private String QueQuan;
    private double diem;

    public Nguoi() {}

    public Nguoi(String hovaTen, int age, String queQuan, double diem) {
        this.HovaTen = hovaTen;
        this.age = age;
        this.QueQuan = queQuan;
        this.diem = diem;
    }

    public String getHovaTen() {
        return HovaTen;
    }

    public void setHovaTen(String hovaTen) {
        HovaTen = hovaTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void input() {
        System.out.print("Nhap ho va ten: "); HovaTen = new Scanner(System.in).nextLine();
        System.out.print("Nhap tuoi: "); age = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Nhap que quan: "); QueQuan = new Scanner(System.in).nextLine();
        System.out.print("Nhap diem: "); diem = Double.parseDouble(new Scanner(System.in).nextLine());
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10d %-15s %-10f", getHovaTen(), getAge(), getQueQuan(), getDiem());
    }

    public void output() {
        System.out.println(toString());
    }
}
