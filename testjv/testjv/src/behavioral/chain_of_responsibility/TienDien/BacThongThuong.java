package behavioral.chain_of_responsibility.TienDien;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang keTiep;
    public BacThongThuong(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang keTiep(TienDienBacThang k) {
        this.keTiep = k;
        return  this.keTiep;
    }

    @Override
    public int tinhTien(int soKW) {
        if(soKW <=max){
            return (soKW - min)*gia;
        }
        else{
            return (max-min)*gia+keTiep.tinhTien(soKW);
        }
    }
}
