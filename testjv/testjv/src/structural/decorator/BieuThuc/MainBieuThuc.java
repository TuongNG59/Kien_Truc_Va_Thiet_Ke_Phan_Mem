package structural.decorator.BieuThuc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc bt = new BieuThucDonGian(10);
        bt = new Cong(bt, 5); // (10 + 5)
        bt = new Tru(bt, 3);  // ((10 + 5) - 3)
        System.out.println("Biểu thức: " + bt.bieuThuc());
        System.out.println("Giá trị: " + bt.giaTri());
    }
}
