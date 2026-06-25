package structural.composite.KeHoachHocTap;

public class MonHoc extends KeHoachHocTap {
    int soTC;
    int hocPhi;

    public MonHoc(String ten, int soTC, int hocPhi) {
        super(ten);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public KeHoachHocTap them(KeHoachHocTap k){
        throw new  UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void xoa(KeHoachHocTap k) {

    }

    @Override
    public int getHocPhi() {
        return hocPhi;
    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public String thongTin() {
        return "- Môn học: " + ten + ", Số TC: " + soTC + ", Học phí: " + hocPhi + "\n";
    }
}
