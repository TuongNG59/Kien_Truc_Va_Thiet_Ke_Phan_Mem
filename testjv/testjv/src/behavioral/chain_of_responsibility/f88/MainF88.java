package behavioral.chain_of_responsibility.f88;

public class MainF88 {
    public static void main(String[] args) {
        NhanVienF88 nvhs = new NhanVienChoVay("Thư kí", "Hữu Trọng", 1000000);
        NhanVienF88 phoPhong = new NhanVienChoVay("Phó phòng", "Phạm Minh Quang", 20000);
        NhanVienF88 chuTich = new ChuTich("Chủ tịch", "Nguyễn Huỳnh Tường", 500000000);

        nvhs.capTren(phoPhong);
        nvhs.capTren(chuTich);
        phoPhong.capTren(chuTich);

        nvhs.duyetChoVay(5000);
        phoPhong.duyetChoVay(30000);
        chuTich.duyetChoVay(500000001);
    }
}
