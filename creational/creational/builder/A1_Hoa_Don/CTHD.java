package creational.builder.A1_Hoa_Don;

public class CTHD {
    String sanPham;
    int donGia;
    int sl;
    float chietKhau;

    public CTHD(String sanPham, int donGia, int sl, float chietKhau) {
        this.sanPham = sanPham;
        this.donGia = donGia;
        this.sl = sl;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "sanPham='" + sanPham + '\'' +
                ", donGia=" + donGia +
                ", sl=" + sl +
                ", chietKhau=" + chietKhau +
                '}';
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }
}
