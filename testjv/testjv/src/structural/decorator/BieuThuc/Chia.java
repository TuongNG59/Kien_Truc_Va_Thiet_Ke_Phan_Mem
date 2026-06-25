package structural.decorator.BieuThuc;

public class Chia extends BieuThucDecorator{
    float toanHang;

    public Chia(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() + toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + " / " + toanHang + ")";
    }
}
