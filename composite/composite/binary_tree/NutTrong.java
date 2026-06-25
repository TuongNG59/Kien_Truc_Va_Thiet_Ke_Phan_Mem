package structural.composite.binary_tree;

public class NutTrong extends Nut{
    Nut trai, phai;
    public NutTrong(int giatri) {
        super(giatri);
    }

    @Override
    public void duyet() {
        if(trai!=null)
            trai.duyet();
        System.out.println(giatri);
        if(phai!=null)
            phai.duyet();
    }

    @Override
    public void addRight(Nut n) {
        phai = n;
    }

    @Override
    public void addLeft(Nut n) {
        trai = n;
    }

    @Override
    public void removeRight() {
        phai = null;
    }

    @Override
    public void removeLeft() {
        trai = null;
    }
}
