import java.util.Scanner;

public class NVBanHang extends NhanVien implements LoaiNhanVien{
    Scanner sc=new Scanner(System.in);
    @Override
    public void ChucVu()
    {
        chucvu="NV ban hang";
    }
    @Override
    public void Luong()
    {
        luong="10.000.000vnd";
    }
}
