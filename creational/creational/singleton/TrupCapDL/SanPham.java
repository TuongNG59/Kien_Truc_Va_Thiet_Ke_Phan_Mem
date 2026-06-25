package creational.singleton.TrupCapDL;

public class SanPham {
    String masp, tensp;
    int sl;
    long dongia;

    public SanPham(String tensp,String masp, int sl, long dongia) {
        this.masp = masp;
        this.tensp = tensp;
        this.sl = sl;
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", sl=" + sl +
                ", dongia=" + dongia +
                '}';
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public long getDongia() {
        return dongia;
    }

    public void setDongia(long dongia) {
        this.dongia = dongia;
    }
}
