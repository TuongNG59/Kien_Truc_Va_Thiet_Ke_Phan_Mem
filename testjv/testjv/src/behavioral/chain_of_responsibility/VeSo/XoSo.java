package behavioral.chain_of_responsibility.VeSo;

import java.util.List;

public abstract class XoSo {
    String tenGiai;
    List<String>boSoTrungThuong;
    XoSo keTiep;

    public XoSo thietLapKeTiep(XoSo k) {
        this.keTiep = k;
        return k;
    }

    public abstract String doVeSo(String veSo);
}
