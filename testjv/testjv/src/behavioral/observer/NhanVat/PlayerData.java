package behavioral.observer.NhanVat;

public class PlayerData {

    private PlayerDataListener listener;
    private int thoiGian;
    private int soLuotChoi;
    private int diemSo;

    public PlayerData(int thoiGian, int soLuotChoi, int diemSo) {
        this.thoiGian = thoiGian;
        this.soLuotChoi = soLuotChoi;
        this.diemSo = diemSo;
    }

    public void dangKy(PlayerDataListener listener){
        this.listener = listener;
    }

    public void huyDangKy(PlayerDataListener listener){
        if(this.listener == listener){
            this.listener = null;
        }
    }

    private void thongBao(){
        if(listener != null){
            listener.listen(this);
        }
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public int getSoLuotChoi() {
        return soLuotChoi;
    }

    public int getDiemSo() {
        return diemSo;
    }

    public void setThoiGian(int thoiGian){
        this.thoiGian = thoiGian;
        thongBao();
    }

    public void setDiemSo(int diemSo){
        this.diemSo = diemSo;
        thongBao();
    }

    public void setSoLuotChoi(int soLuotChoi){
        this.soLuotChoi = soLuotChoi;
        thongBao();
    }
}
