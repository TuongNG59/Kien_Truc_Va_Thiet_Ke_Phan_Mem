package behavioral.observer.atm;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk = new TaiKhoan("Tuong", 1000000000, atm);

        atm.nhanThe(tk);
        atm.rutTien(500000000);
        atm.rutTien(600000000);
        atm.traThe();

    }
}
