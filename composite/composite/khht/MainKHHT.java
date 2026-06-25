package structural.composite.khht;

public class MainKHHT {
    public static void main(String[] args) {
        KeHoachHocTap nam1 = new KHHTChung("Năm 1");
        KeHoachHocTap nam2 = new KHHTChung("Năm 2");
        KeHoachHocTap hk1 = new KHHTChung("Học kỳ 1");
        KeHoachHocTap hk2 = new KHHTChung("Học kỳ 2");
        KeHoachHocTap kh = new KHHTChung("Khóa học cấp tốc");
        KeHoachHocTap java = new MonHoc("Lập trình Java",3,1000000);
        KeHoachHocTap designpattern = new MonHoc("Mẫu thiết kế",3,1500000);
        KeHoachHocTap android = new MonHoc("Lập trình di động",4,1580000);
        KeHoachHocTap nnc = new MonHoc("Lập trình ngôn ngữ C",2,2580000);
        nam1.them(hk1).them(hk2);
        hk1.them(java).them(android);
        hk2.them(designpattern).them(nnc);
        kh.them(nam1).them(nam2);
        System.out.println(kh.toString(" "));
    }
}
