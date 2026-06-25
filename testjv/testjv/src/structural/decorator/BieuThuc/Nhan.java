package structural.decorator.BieuThuc;

public class Nhan extends BieuThucDecorator{
    float toanHang;

    public Nhan(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() + toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + " x " + toanHang + ")";
    }
}
