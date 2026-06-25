package structural.composite.khht;

public abstract class KeHoachHocTap {
    protected String ten;

    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }

    public abstract KeHoachHocTap them(KeHoachHocTap kh);
    public abstract void xoa(KeHoachHocTap kh);
    public abstract int getHocPhi();
    public abstract int getSoTC();
    public abstract String toString(String preStr);
}
