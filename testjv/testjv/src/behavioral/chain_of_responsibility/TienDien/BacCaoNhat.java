package behavioral.chain_of_responsibility.TienDien;

public class BacCaoNhat extends TienDienBacThang{
    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang keTiep(TienDienBacThang k) {
        return null;
    }

    @Override
    public int tinhTien(int soKW) {
        return (soKW - min) * gia;
    }
}
