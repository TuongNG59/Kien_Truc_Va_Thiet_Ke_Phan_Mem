package behavioral.observer.atm;

public class TaiKhoan implements ATMListener {
    String name;
    int soDu;
    ATM atm;

    public TaiKhoan(String name, int soDu, ATM atm) {
        this.name = name;
        this.soDu = soDu;
        this.atm = atm;
    }

    @Override
    public boolean checkBalance(int Tien) {
        System.out.println("Kiểm tra số dư");
        return soDu - Tien >= 50;
    }

    @Override
    public void thongBao(int Tien, boolean b) {
        if(b == true) {
            System.out.println("Số dư ban đầu: " + soDu);
            System.out.println("Số tiền rút: " + Tien);
            soDu -= Tien;
            System.out.println("Số dư còn lại: "+ soDu);
        }
        else {
            System.out.println("Giao dịch thất bại! Số dư ko đủ");
        }
    }

    public void nhetThe(){
        atm.nhanThe(this);
    }

    public void nhanThe(){
        atm.traThe();
    }
}
