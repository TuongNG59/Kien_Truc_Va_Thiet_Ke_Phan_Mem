package behavioral.chain_of_responsibility.VeSo;

import java.util.List;

public class GiaiThuong extends XoSo{
    public GiaiThuong(String tenGiai, List<String> boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }

    @Override
    public String doVeSo(String veSo) {
        for(String soTrung :  boSoTrungThuong){
            if(veSo.endsWith(soTrung)){
                return "Trúng " + tenGiai;
            }
        }
        if(keTiep!=null){
            return keTiep.doVeSo(veSo);
        }
        return "Không trúng";
    }
}
