package behavioral.chain_of_responsibility.TienDien;

public abstract class TienDienBacThang {
    String tenBac;
    int min = Integer.MAX_VALUE;
    int max = Integer.MAX_VALUE;
    int gia;

    public TienDienBacThang(String tenBac, int min, int max, int gia) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    public abstract TienDienBacThang keTiep(TienDienBacThang k);
    public abstract int tinhTien(int soKW);
}
