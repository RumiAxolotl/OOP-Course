import java.util.Scanner;

public class CanBo extends Nhanvien {
    private String ChucVu;
    private String PhongBan;
    private double PhuCapLanhDao;

    public CanBo() {}

    public CanBo(String id, String name, int yearWorking, double hesoLuong, int restDay) {
        super(id, name, yearWorking, hesoLuong, restDay);
        this.ChucVu = "Nhan Vien";
        this.PhongBan = "Phong cho nhan vien";
        this.PhuCapLanhDao = 0;
    }

    public CanBo(String id, String name, int yearWorking, double hesoLuong, int restDay, String ChucVu, String PhongBan, float PhuCapLanhDao) {
        super(id, name, yearWorking, hesoLuong, restDay);
        this.ChucVu = ChucVu;
        this.PhongBan = PhongBan;
        this.PhuCapLanhDao = PhuCapLanhDao;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public double getPhuCapLanhDao() {
        return PhuCapLanhDao;
    }

    public void setChucVu(String chucVu) {
        this.ChucVu = chucVu;
    }

    public void setPhongBan(String phongBan) {
        this.PhongBan = phongBan;
    }

    public void setPhuCapLanhDao(float phuCapLanhDao) {
        this.PhuCapLanhDao = phuCapLanhDao;
    }

    @Override
    public double PhuCap() {
        return PhuCapLanhDao * super.getLuongCoBan();
    }

    public double LuongCanBo() {
        return super.LuongNhanVien() + PhuCap();
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap chuc vu: "); ChucVu = new Scanner(System.in).nextLine();
        System.out.print("Nhap phong ban: "); PhongBan = new Scanner(System.in).nextLine();
        System.out.print("Nhap phu cap lanh dao: "); PhuCapLanhDao = Double.parseDouble(new Scanner(System.in).nextLine());
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-12d %-12.2f %-12d %-12c %-12.2f %-12.2f %-10s %-10s %-12.2f", super.getId(), super.getName(), super.getYearWorking(), super.getHesoLuong(),
                super.getRestDay(), super.Ranking(), super.PhuCap(), super.LuongNhanVien(), getChucVu(), getPhongBan(), getPhuCapLanhDao());
    }

    @Override
    public void output() {
        System.out.format("%-10s %-20s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s\n",
                "Ma NV", "Ten Nhan Vien", "Nam", "HSL", "Day off", "Rank", "PhuCap", "Luong", "Chucvu", "Phongban", "HSLCB");
        System.out.println("===============================================================" +
                "================================================");
        System.out.println(toString());
    }
}
