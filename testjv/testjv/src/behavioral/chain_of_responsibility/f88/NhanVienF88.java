package behavioral.chain_of_responsibility.f88;

public abstract class NhanVienF88 {
    String chucVu, ten;
    int hanMucDuyetVay;
    NhanVienF88 capTren;

    public NhanVienF88(String chucVu, String ten, int hanMucDuyetVay) {
        this.chucVu = chucVu;
        this.ten = ten;
        this.hanMucDuyetVay = hanMucDuyetVay;
    }

    public NhanVienF88 capTren(NhanVienF88 capTren) {
        this.capTren = capTren;
        return this.capTren;
    }

    public abstract void duyetChoVay(int khoanVay);
}
