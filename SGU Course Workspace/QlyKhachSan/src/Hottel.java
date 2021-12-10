import java.util.Date;
import java.util.Scanner;

public class Hottel extends Person {
    private int ngayTro;
    private String loaiPhongTro;
    private double giaPhong;
    private Person thongtinCaNhan = new Person();

    public Hottel() {}

    public Hottel(String hoten, int tuoi, int namSinh, String cmnd, int ngayTro, String loaiPhongTro, double giaPhong, Person thongtinCaNhan) {
        super(hoten, tuoi, namSinh, cmnd);
        this.ngayTro = ngayTro;
        this.loaiPhongTro = loaiPhongTro;
        this.giaPhong = giaPhong;
        this.thongtinCaNhan = thongtinCaNhan;
    }

    public int getNgayTro() {
        return ngayTro;
    }

    public void setNgayTro(int ngayTro) {
        this.ngayTro = ngayTro;
    }

    public String getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(String loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public Person getThongtinCaNhan() {
        return thongtinCaNhan;
    }

    public void setThongtinCaNhan(Person thongtinCaNhan) {
        this.thongtinCaNhan = thongtinCaNhan;
    }

    public void input() {
        System.out.println("=========================================================================");
        System.out.print("Nhap vao so ngay tro: "); ngayTro = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Nhap loai phong Tro: "); loaiPhongTro = new Scanner(System.in).nextLine();
        System.out.print("Nhap gia Phong Tro: "); giaPhong = Double.parseDouble(new Scanner(System.in).nextLine());
        thongtinCaNhan.input();
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10d %-10d %-13s %-10d %-13s %-13f",
                thongtinCaNhan.getHoten(), thongtinCaNhan.getTuoi(), thongtinCaNhan.getNamSinh(), thongtinCaNhan.getCmnd(),
                getNgayTro(), getLoaiPhongTro(), getGiaPhong());
    }

    public void output() {
        System.out.println(toString());
    }
}
