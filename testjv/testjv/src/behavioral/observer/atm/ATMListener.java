package behavioral.observer.atm;

public interface ATMListener {
    public boolean checkBalance(int Tien);
    public void thongBao(int Tien, boolean b);
}
