import java.util.Scanner;

public class DsHottel {
    private Hottel ds[];
    private int n;

    public void input() {
        System.out.print("Xin moi nhap vo so luong ptu trong danh sach: ");
        n = Integer.parseInt(new Scanner(System.in).nextLine());

        ds = new Hottel[n];
        System.out.println("Moi nhap vao thong tin cua khach hang: ");
        for(int i=0;i<n;i++) {
            ds[i] = new Hottel();
            ds[i].input();
        }
    }

    public void output() {
        System.out.format("%-15s %-10s %-10s %-13s %-10s %-13s %-13s",
                "Hoten", "Tuoi", "NamSinh", "CMND", "NgayTro", "LoaiPhong", "GiaPhong");
        System.out.println("\n=========================================================================");
        for(Hottel i : ds) {
            i.output();
        }
    }

    public static void main(String[] args) {
        DsHottel ds = new DsHottel();
        ds.input();
        ds.output();
    }
}
