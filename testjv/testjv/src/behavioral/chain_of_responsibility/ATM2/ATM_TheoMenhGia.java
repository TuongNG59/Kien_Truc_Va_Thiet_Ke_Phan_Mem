package behavioral.chain_of_responsibility.ATM2;

import behavioral.chain_of_responsibility.ATM.MenhGiaATM;

public abstract class ATM_TheoMenhGia{
    int menhGia;

    public ATM_TheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract ATM_TheoMenhGia keTiep(ATM_TheoMenhGia m);
    public abstract void rutTien(int soTien);

}
