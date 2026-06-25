package behavioral.chain_of_responsibility.ATM2;

public abstract class ChuoiMenhGiaFactory {
    protected abstract ATM_TheoMenhGia getChuoiMenhGia(int menhGia);
    public void rutTien(int soTien, int menhGiaCaoNhat){
        ATM_TheoMenhGia m = getChuoiMenhGia(menhGiaCaoNhat);
        m.rutTien(soTien);
    }

}
