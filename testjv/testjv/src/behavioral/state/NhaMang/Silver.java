package behavioral.state.NhaMang;

public class Silver implements NhaMangState {

    @Override
    public void napTienHandle(int soTien, NhaMang nhamang) {
        nhamang.balance += (soTien*105)/100;
        if(nhamang.balance>200000)
            nhamang.setState(new Gold());
    }

    @Override
    public void thucHienCuocGoiHandle(int soGiay, NhaMang nhamang) {
        int giaCuoc = 1500/60;
        if(nhamang.balance - soGiay*giaCuoc>100000){
            nhamang.balance -= soGiay*giaCuoc;
            System.out.println("Trang thai: Silver");
            System.out.println("So du: "+nhamang.balance);
        }
        else{
            int tgSilver = 0;
            for(;;){
                tgSilver++;
                nhamang.balance -= giaCuoc;
                if(nhamang.balance<=100000) {
                    break;
                }
            }
            nhamang.setState(new Normal());
            nhamang.thucHienCuocGoi(soGiay-tgSilver);
        }
    }

    @Override
    public void inThongTinHandle(NhaMang nhamang) {
        System.out.println("Trang thai: Silver");
        System.out.println("So du: "+nhamang.balance);
        System.out.println("Thoi gian goi con lai: "+nhamang.thoiGianGoi(nhamang.balance)+" giay");
    }

    @Override
    public int xyLyThoiGianGoi(int soTien, NhaMang nhamang) {
        int tgSilver = 0;
        int giaCuoc = 1500/60;
        int soDu = soTien;
        for(;;){
            tgSilver++;
            soDu -= giaCuoc;
            if(soDu <= 100000)
                break;
        }
        nhamang.setState(new Normal());
        int tgNormal = nhamang.thoiGianGoi(soDu);
        nhamang.setState(new Silver());
        return tgSilver + tgNormal;
    }
}
