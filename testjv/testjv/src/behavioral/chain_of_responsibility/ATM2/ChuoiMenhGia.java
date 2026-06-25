package behavioral.chain_of_responsibility.ATM2;


import behavioral.chain_of_responsibility.ATM.MenhGiaATM;

public class ChuoiMenhGia extends ChuoiMenhGiaFactory{
    ATM_TheoMenhGia m500 = new MenhGia(500);
    ATM_TheoMenhGia m200 = new MenhGia(200);
    ATM_TheoMenhGia m100 = new MenhGia(100);
    ATM_TheoMenhGia m50 = new MenhGia(50);
    ATM_TheoMenhGia m20 = new MenhGia(20);
    ATM_TheoMenhGia m10 = new MenhGia(10);
    ATM_TheoMenhGia m5 = new MenhGia(5);
    ATM_TheoMenhGia m2 = new MenhGia(2);
    ATM_TheoMenhGia m1 = new MenhGiaThapNhat(1);

    public ChuoiMenhGia() {
        m500.keTiep(m200).keTiep(m100).keTiep(m50).keTiep(m20).keTiep(m10).keTiep(m5).keTiep(m2).keTiep(m1);
    }

    @Override
    protected ATM_TheoMenhGia getChuoiMenhGia(int menhGia) {
        switch (menhGia) {
            case 500: return m500;
            case 200: return m200;
            case 100: return m100;
            case 50: return m50;
            case 20: return m20;
            case 10: return m10;
            case 5: return m5;
            case 2: return m2;
            case 1: return m1;
        }
        return null;
    }
}
