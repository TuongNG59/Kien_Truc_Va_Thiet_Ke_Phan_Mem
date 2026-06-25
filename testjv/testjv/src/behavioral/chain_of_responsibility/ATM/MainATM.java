package behavioral.chain_of_responsibility.ATM;

public class MainATM {
    public static void main(String[] args) {
        MenhGiaATM m500 = new MenhGia(500);
        MenhGiaATM m200 = new MenhGia(200);
        MenhGiaATM m100 = new MenhGia(100);
        MenhGiaATM m50 = new MenhGia(50);
        MenhGiaATM m20 = new MenhGia(20);
        MenhGiaATM m10 = new MenhGia(10);
        MenhGiaATM m5 = new MenhGia(5);
        MenhGiaATM m2 = new MenhGia(2);
        MenhGiaATM m1 = new MenhGiaThapNhat(1);

        m500.keTiep(m200)
                .keTiep(m100)
                .keTiep(m50)
                .keTiep(m20)
                .keTiep(m10)
                .keTiep(m5)
                .keTiep(m2)
                .keTiep(m1);
        m500.rutTien(1867);
    }
}
