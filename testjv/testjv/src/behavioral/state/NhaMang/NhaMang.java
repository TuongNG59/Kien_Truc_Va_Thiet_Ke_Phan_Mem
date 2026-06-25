package behavioral.state.NhaMang;

public class NhaMang {
    String tenTB;
    int balance;
    NhaMangState state;

    public NhaMang(String tenTB, int balance, NhaMangState state) {
        this.tenTB = tenTB;
        this.balance = balance;
        this.state = state;
    }

    public void napTien(int soTien){
        state.napTienHandle(soTien, this);
    }

    public void thucHienCuocGoi(int soGiay){
        state.napTienHandle(soGiay, this);
    }

    protected int thoiGianGoi(int soTien){
        return state.xyLyThoiGianGoi(soTien, this);
    }

    public void inThongTin(){
        state.inThongTinHandle(this);
    }

    public void setState(NhaMangState state) {
        this.state = state;
    }
}
