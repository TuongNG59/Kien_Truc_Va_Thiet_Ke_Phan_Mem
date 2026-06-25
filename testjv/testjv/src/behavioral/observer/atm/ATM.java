package behavioral.observer.atm;

public class ATM {
    ATMListener taikhoan;
    public void nhanThe(ATMListener taikhoan) {
        System.out.println("Đã nhận thẻ");
        this.taikhoan = taikhoan;
    }

    public void traThe(){
        if(taikhoan!=null){
            System.out.println("Trả thẻ");
            taikhoan = null;
        }
    }

    public void rutTien(int Tien){
        if(taikhoan==null){
            System.out.println("Không có thẻ");
            return;
        }

        if(taikhoan.checkBalance(Tien)){
            System.out.println("Giao dịch thành công số tiền rút là " + Tien);
            taikhoan.thongBao(Tien,true);
        }

        else {
            System.out.println("Không đủ tiền");
            taikhoan.thongBao(Tien,false);
        }
    }
}
