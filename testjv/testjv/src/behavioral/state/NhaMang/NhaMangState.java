package behavioral.state.NhaMang;

public interface NhaMangState {
    void napTienHandle(int soTien, NhaMang nhamang);
    void thucHienCuocGoiHandle(int soGiay, NhaMang nhamang);
    void inThongTinHandle(NhaMang nhamang);

    int xyLyThoiGianGoi(int soTien, NhaMang nhamang);
}
