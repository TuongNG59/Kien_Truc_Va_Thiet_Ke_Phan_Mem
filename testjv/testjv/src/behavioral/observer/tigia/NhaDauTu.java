package behavioral.observer.tigia;

public abstract class NhaDauTu implements TiGia.TiGiaListener {
    TiGia tigia;

    public NhaDauTu(TiGia tigia) {
        this.tigia = tigia;
        tigia.attach(this);
    }

    // 2 phuong thuc phat sinh de demo
    public void dangKy(){
        tigia.attach(this);
    }

    public void huyDangKy(){
        tigia.detach(this);
    }
}
