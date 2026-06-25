package behavioral.observer.tigia;

public class NhaDauTuB extends NhaDauTu{
    public NhaDauTuB(TiGia tigia) {
        super(tigia);
    }

    @Override
    public void listen(float delta) {
        if(delta >= 0){
            System.out.println("Nhà đầu tư loại B: Gom vào");
        }
        else {
            System.out.println("Nhà đầu tư loại B: Bán ra");
        }
    }
}
