package behavioral.chain_of_responsibility.f88;

public class NhanVienChoVay extends NhanVienF88{
    public NhanVienChoVay(String chucVu,String ten, int hanMucDuyetVay){
        super(chucVu, ten, hanMucDuyetVay );
    }

    @Override
    public void duyetChoVay(int khoanVay) {
        if(khoanVay<=hanMucDuyetVay){
            System.out.println(chucVu+" "+ ten + " duyệt khoản vay " + khoanVay);
        }
        else{
            this.capTren.duyetChoVay(khoanVay);
        }
    }

    public NhanVienF88 capTren(NhanVienF88 capTren){
        this.capTren = capTren;
        return this.capTren;
    }
}
