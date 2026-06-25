package structural.composite.Binary_tree;

public class NutTrong extends Nut{
    Nut trai,phai;
    public NutTrong(int giaTri) {
        super(giaTri);
    }

    @Override
    public void duyet() {
        //Duyệt LNR
        if(trai!=null){
            trai.duyet();
        }
        System.out.println(giaTri);
        if(phai!=null){
            phai.duyet();
        }

    }

    @Override
    public void themTrai(Nut n) {
        trai=n;
    }

    @Override
    public void themPhai(Nut n) {
        phai=n;
    }

    @Override
    public void xoaTrai() {
        trai=null;
    }

    @Override
    public void xoaPhai() {
        phai=null;
    }
}
