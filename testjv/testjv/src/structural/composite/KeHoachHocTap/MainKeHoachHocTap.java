package structural.composite.KeHoachHocTap;

public class MainKeHoachHocTap {
    public static void main(String[] args) {
        KeHoachChung kehoachhocky = new KeHoachChung("Học kì 1");

        MonHoc mon1 = new MonHoc("Lập trình Java", 3, 1500000);
        MonHoc mon2 = new MonHoc("Cấu trúc dữ liệu", 4, 2000000);
        MonHoc mon3 = new MonHoc("Toán rời rạc", 3, 1500000);

        kehoachhocky.them(mon1).them(mon2).them(mon3);

        System.out.println(kehoachhocky.thongTin());
        System.out.println(kehoachhocky.getHocPhi());

    }
}
