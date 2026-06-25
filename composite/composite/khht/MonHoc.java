package structural.composite.khht;

import java.text.Format;

public class MonHoc extends KeHoachHocTap{
    int soTC, hocPhi;

    public MonHoc(String ten,int soTC, int hocPhi) {
        super(ten);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public KeHoachHocTap them(KeHoachHocTap kh) {

        return this;
    }

    @Override
    public void xoa(KeHoachHocTap kh) {

    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public int getHocPhi() {
        return hocPhi;
    }


    @Override
    public String toString(String preStr) {
        String formatHP = String.format("%,d",this.hocPhi);
        return preStr + ten +", TC: " +soTC +", Học Phí: "+ formatHP;
    }
}
