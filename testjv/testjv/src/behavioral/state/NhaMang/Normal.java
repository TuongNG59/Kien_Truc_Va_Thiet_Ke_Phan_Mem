package behavioral.state.NhaMang;

public class Normal implements NhaMangState{
    @Override
    public void napTienHandle(int soTien, NhaMang nhamang) {
        nhamang.balance += soTien;
        if(nhamang.balance > 100000 && nhamang.balance <= 200000)
            nhamang.setState(new Silver());
        else if (nhamang.balance>200000) {
            nhamang.setState(new Gold());
        }
    }

    @Override
    public void thucHienCuocGoiHandle(int soGiay, NhaMang nhamang) {
        int cuocGoi = soGiay*(1800/60);
        nhamang.balance = nhamang.balance < cuocGoi ? 0 : nhamang.balance - cuocGoi;
        System.out.println("Trang thai: Normal");
        System.out.println("So du "+ nhamang.balance);
    }

    @Override
    public void inThongTinHandle(NhaMang nhamang) {
        System.out.println("Trang thai: Normal");
        System.out.println("So du "+nhamang.balance);
        System.out.println("Thoi gian con lai: "+nhamang.thoiGianGoi(nhamang.balance)+" giay");
    }

    @Override
    public int xyLyThoiGianGoi(int soTien, NhaMang nhamang) {
        return soTien/(1800/60);
    }
}
