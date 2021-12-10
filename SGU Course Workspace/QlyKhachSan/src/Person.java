import java.util.Scanner;

public class Person {
    private String hoten;
    private int tuoi;
    private int namSinh;
    private String cmnd;

    public Person() {}

    public Person(String hoten, int tuoi, int namSinh, String cmnd) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.cmnd = cmnd;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void input() {
        System.out.print("Nhap vao ho ten: "); hoten = new Scanner(System.in).nextLine();
        System.out.print("Nhap vao tuoi: "); tuoi = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Nhap vao nam sinh: "); namSinh = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Nhap vao cmnd: "); cmnd = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10d %-10d %-13s", getHoten(), getTuoi(), getNamSinh(), getCmnd());
    }

    public void output() {
        System.out.println(toString());
    }
}
