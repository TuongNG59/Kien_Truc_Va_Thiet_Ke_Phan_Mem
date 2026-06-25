package behavioral.strategy.QLSV;

import java.util.Date;

public class SinhVien {
    private String hoTen;
    private String ngaySinh;
    private float diemTB;

    public SinhVien(String hoTen, String ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }
}
