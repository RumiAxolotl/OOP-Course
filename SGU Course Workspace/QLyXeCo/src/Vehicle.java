import java.util.Scanner;

public class Vehicle {
    private String TenChuXe;
    private String LoaiXe;
    private double GiaTriXe;
    private double DungTich;

    public Vehicle() {}

    public Vehicle(String tenChuXe, String loaiXe, double giaTriXe, double dungTich) {
        this.TenChuXe = tenChuXe;
        this.LoaiXe = loaiXe;
        this.GiaTriXe = giaTriXe;
        this.DungTich = dungTich;
    }

    public String getTenChuXe() {
        return TenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        TenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        LoaiXe = loaiXe;
    }

    public double getGiaTriXe() {
        return GiaTriXe;
    }

    public void setGiaTriXe(double giaTriXe) {
        this.GiaTriXe = giaTriXe;
    }

    public double getDungTich() {
        return DungTich;
    }

    public void setDungTich(double dungTich) {
        this.DungTich = dungTich;
    }

    public double getMucThue() {
        if(DungTich < 100) return 0.01;
        else {
            if(DungTich >= 100 && DungTich <= 200) return 0.03;
            else return 0.05;
        }
    }

    public double getTienThue(double dungTich) {
        return GiaTriXe * getMucThue();
    }

    public double getTotal(double giaTriXe, double dungTich) {
        return giaTriXe + getTienThue(dungTich);
    }

    public void input() {
        System.out.print("\nNhap vao ten chu xe: ");
        setTenChuXe(new Scanner(System.in).nextLine());

        System.out.print("Nhap vao Loai xe: ");
        setLoaiXe(new Scanner(System.in).nextLine());

        System.out.print("Nhap vao gia tri cua xe: ");
        setGiaTriXe(Double.parseDouble(new Scanner(System.in).nextLine()));

        System.out.print("Nhap vao dung tich cua xe: ");
        setDungTich(Double.parseDouble(new Scanner(System.in).nextLine()));
    }

    @Override
    public String toString() {
        return String.format("%-25s%-20s%10s%15.2f%15.2f%15.2f", getTenChuXe(), getLoaiXe(), getDungTich()
                , getGiaTriXe(), getTienThue(getDungTich()), getTotal(getGiaTriXe(), getDungTich()));
    }

    public void output() {
        System.out.println(toString());
    }
}
