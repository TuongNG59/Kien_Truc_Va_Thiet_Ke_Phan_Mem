package behavioral.observer.tigia;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia tigia = new TiGia();
        NhaDauTu a = new NhaDauTuA(tigia);
        NhaDauTu b = new NhaDauTuB(tigia);
        System.out.println("Cả hai");
        tigia.thayDoiTiGia(5);
        System.out.println("Chỉ có 1");
        a.huyDangKy();
        tigia.thayDoiTiGia(-3);
        System.out.println("Dăng kí lại");
        a.dangKy();
        tigia.thayDoiTiGia(2);
    }
}
