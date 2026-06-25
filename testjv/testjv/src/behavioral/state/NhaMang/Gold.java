package behavioral.state.NhaMang;

public class Gold implements NhaMangState{

    @Override
    public void napTienHandle(int soTien, NhaMang nhamang) {
        nhamang.balance += (soTien*110)/100;
    }

    @Override
    public void thucHienCuocGoiHandle(int soGiay, NhaMang nhamang) {
        int giaCuoc = 1200/60;
        if(nhamang.balance - soGiay*giaCuoc > 200000){
            nhamang.balance -= soGiay*giaCuoc;
            System.out.println("Trang thai: Gold");
            System.out.println("So du: " + nhamang.balance);
        }
        else {
            int tgGold = 0;
            for(;;){
                tgGold++;
                nhamang.balance -= giaCuoc;
                if(nhamang.balance<=200000){
                    break;
                }
            }
            nhamang.setState(new Silver());
            nhamang.thucHienCuocGoi(soGiay - tgGold);
        }
    }

    @Override
    public void inThongTinHandle(NhaMang nhamang) {
        System.out.println("Trang thai: Gold");
        System.out.println("So du: " + nhamang.balance);
        System.out.println("Thoi gian con lai: " + nhamang.thoiGianGoi(nhamang.balance)+ " giay");
    }

    @Override
    public int xyLyThoiGianGoi(int soTien, NhaMang nhamang) {
        int tgGold = 0;
        int giaCuoc = 1200/60;
        int soDu = nhamang.balance;
        for(;;){
            tgGold++;
            soDu -= giaCuoc;
            if(soDu <= 200000)
                break;
        }
        nhamang.setState(new Silver());
        int tgSilver = nhamang.thoiGianGoi(soDu);
        nhamang.setState(new Gold());
        return tgSilver + tgGold;
    }
}
