import java.util.Scanner;

public class Hoctap extends Nguoi{
    private String Lop;
    private String KhoaHoc;
    private int HocKi;
    private Nguoi thongtinCaNhan = new Nguoi();

    public Hoctap() {}

    public Hoctap(String hovaTen, int age, String queQuan, double diem, String lop, String khoaHoc, int hocKi, Nguoi thongtinCaNhan) {
        super(hovaTen, age, queQuan, diem);
        this.Lop = lop;
        this.KhoaHoc = khoaHoc;
        this.HocKi = hocKi;
        this.thongtinCaNhan = thongtinCaNhan;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        this.Lop = lop;
    }

    public String getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.KhoaHoc = khoaHoc;
    }

    public int getHocKi() {
        return HocKi;
    }

    public void setHocKi(int hocKi) {
        this.HocKi = hocKi;
    }

    public Nguoi getThongtinCaNhan() {
        return thongtinCaNhan;
    }

    public void setThongtinCaNhan(Nguoi thongtinCaNhan) {
        this.thongtinCaNhan = thongtinCaNhan;
    }

    public void input() {
        System.out.println("=========================================================================");
        thongtinCaNhan.input();
        System.out.print("Nhap vao lop: "); Lop = new Scanner(System.in).nextLine();
        System.out.print("Nhap vao Khoa Hoc: "); KhoaHoc = new Scanner(System.in).nextLine();
        System.out.print("Nhap vao Hoc Ki: "); HocKi = Integer.parseInt(new Scanner(System.in).nextLine());
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10d %-15s %-10.2f %-10s %-10s %-10d",
                thongtinCaNhan.getHovaTen(), thongtinCaNhan.getAge(), thongtinCaNhan.getQueQuan(), thongtinCaNhan.getDiem(),
                getLop(), getKhoaHoc(), getHocKi());
    }

    public void output() {
        System.out.println(toString());
    }


    public int getAgeTTCN(){
        return thongtinCaNhan.getAge();
    }

    public String getQueQuanTTCN() {
        return thongtinCaNhan.getQueQuan();
    }

    public double getDiemTTCN() {
        return  thongtinCaNhan.getDiem();
    }
}
