package behavioral.chain_of_responsibility.VeSo;

import java.util.List;

public class GiaiThapNhat extends XoSo{
    public GiaiThapNhat(String tenGiai, List<String>boSoTrungThuong) {
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

        return "Không trúng giải nào";
    }
}
