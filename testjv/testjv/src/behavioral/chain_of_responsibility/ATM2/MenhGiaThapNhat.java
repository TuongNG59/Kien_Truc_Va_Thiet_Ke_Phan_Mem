package behavioral.chain_of_responsibility.ATM2;

public class MenhGiaThapNhat extends ATM_TheoMenhGia{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM_TheoMenhGia keTiep(ATM_TheoMenhGia m) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / menhGia;
        System.out.println(soTo + " tờ mệnh giá "+menhGia);
    }
}
