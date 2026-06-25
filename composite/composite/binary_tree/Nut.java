package structural.composite.binary_tree;

public abstract class Nut {
    int giatri;

    public Nut(int giatri) {
        this.giatri = giatri;
    }

    public abstract void duyet();

    public abstract void addRight(Nut n);

    public abstract void addLeft(Nut n);

    public abstract void removeRight();

    public abstract void removeLeft();
}
