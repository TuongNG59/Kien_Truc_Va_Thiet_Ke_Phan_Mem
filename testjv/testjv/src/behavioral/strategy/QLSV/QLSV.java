package behavioral.strategy.QLSV;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    private List<SinhVien> ds = new ArrayList<>();
    private ISoSanh<SinhVien> soSanh;

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public void themSinhVien(SinhVien sv){
        ds.add(sv);
    }

    public void sapXep(){
        for (int i=0;i<ds.size();i++){
            for(int j=i+1;j<ds.size();j++){
                if(soSanh.soSanh(ds.get(i), ds.get(j))>0){
                    var s = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, s);
                }
            }
        }
    }

    public void inDS(){
        for(SinhVien sv : ds){
            System.out.println(sv);
        }
    }
}
