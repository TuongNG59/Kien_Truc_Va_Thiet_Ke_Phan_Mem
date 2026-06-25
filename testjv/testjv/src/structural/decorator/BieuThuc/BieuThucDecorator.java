package structural.decorator.BieuThuc;

public abstract class BieuThucDecorator extends BieuThuc {
    BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public abstract float giaTri();

    @Override
    public abstract String bieuThuc();
}
