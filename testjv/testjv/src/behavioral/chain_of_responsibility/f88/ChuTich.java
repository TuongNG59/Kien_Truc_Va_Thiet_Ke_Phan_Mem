package behavioral.chain_of_responsibility.f88;

public class ChuTich extends NhanVienF88{
    public ChuTich(String chucVu,String ten, int hanMucDuyetVay){
        super(chucVu, ten, hanMucDuyetVay);
    }

    @Override
    public void duyetChoVay(int khoanVay) {
        if(khoanVay<=hanMucDuyetVay){
            System.out.println(chucVu+" "+ ten + " duyệt khoản vay " + khoanVay);
        }
        else{
            System.out.println("Ra ngân hàng vay");
        }
    }

    public NhanVienF88 capTren(NhanVienF88 capTren){
        return null;
    }

}
