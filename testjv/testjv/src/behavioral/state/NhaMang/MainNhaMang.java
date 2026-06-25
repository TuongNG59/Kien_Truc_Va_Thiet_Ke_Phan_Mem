package behavioral.state.NhaMang;

public class MainNhaMang {
    static void main(String[] args) {
        NhaMang tb = new NhaMang("Binh", 0, new Normal());
        System.out.println("Nạp 120k");
        tb.napTien(120000);
        tb.inThongTin();
        System.out.println("Nạp 30k");
        tb.napTien(30000);
        tb.inThongTin();
        System.out.println("Gọi điện 50 phút");
        tb.thucHienCuocGoi(50*60);
        tb.inThongTin();
    }
}
