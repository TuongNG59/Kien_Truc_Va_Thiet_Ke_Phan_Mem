package behavioral.observer.tigia;

public class NhaDauTuA extends NhaDauTu{
    public NhaDauTuA(TiGia tigia) {
        super(tigia);
    }

    @Override
    public void listen(float delta) {
        if(delta >= 0){
            System.out.println("Nhà đầu tư loại A: Bán ra");
        }
        else {
            System.out.println("Nhà đầu tư loại A: Mua vào");
        }
    }
}
