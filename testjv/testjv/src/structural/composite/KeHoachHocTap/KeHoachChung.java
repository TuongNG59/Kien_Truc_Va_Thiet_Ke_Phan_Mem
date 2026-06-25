package structural.composite.KeHoachHocTap;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap {
    List<KeHoachHocTap> khhts = new ArrayList<>();

    public KeHoachChung(String ten) {
        super(ten);
    }

    @Override
    public KeHoachHocTap them(KeHoachHocTap k) {
        khhts.add(k);
        return this;
    }

    @Override
    public void xoa(KeHoachHocTap k) {
        khhts.remove(k);
    }

    @Override
    public int getHocPhi() {
        int sum = 0;
        for(KeHoachHocTap h : khhts) {
            sum += h.getHocPhi();
        }
        return sum;
    }

    @Override
    public int getSoTC() {
        int sum = 0;
        for(KeHoachHocTap h : khhts) {
            sum += h.getSoTC();
        }
        return sum;
    }

    @Override
    public String thongTin() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kế hoạch: ").append(ten).append("\n");
        for(KeHoachHocTap k : khhts) {
            sb.append(k.thongTin());
        }
        sb.append("Tổng số TC: ").append(getSoTC()).append(", Tổng học phí: ").append(getHocPhi()).append("\n");
        return sb.toString();
    }
}

