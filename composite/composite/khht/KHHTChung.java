package structural.composite.khht;

import java.util.ArrayList;
import java.util.List;

public class KHHTChung extends KeHoachHocTap{
    List<KeHoachHocTap> khhts = new ArrayList<>();
    public KHHTChung(String ten) {
        super(ten);
    }

    @Override
    public KeHoachHocTap them(KeHoachHocTap kh) {
        khhts.add(kh);
        return this;
    }

    @Override
    public void xoa(KeHoachHocTap kh) {
        if(khhts.contains(kh)){
            khhts.remove(kh);
        }
    }

    @Override
    public int getHocPhi() {
        int t = 0;
        for(var k:khhts){
            t+=k.getHocPhi();
        }
        return t;
    }

    @Override
    public int getSoTC() {
        int tc = 0;
        for(var k:khhts){
            tc+=k.getSoTC();
        }
        return tc;
    }

    @Override
    public String toString(String preStr) {
        StringBuilder builder = new StringBuilder();
        String formatHP = String.format("%,d",getHocPhi());
        builder.append(preStr)
                .append(ten)
                .append(", Tổng số TC: ")
                .append(getSoTC())
                .append(", Tổng học phí: ")
                .append(formatHP);
        for (var k:khhts){
            builder.append("\n").append(k.toString(preStr+ "  "));
        }
        return builder.toString();
    }
}
