package behavioral.chain_of_responsibility.TienDien;

public class MainTienDien {
    public static void main(String[] args) {
        TienDienBacThang b1 = new BacThongThuong("1", 0, 50, 1806);
        TienDienBacThang b2 = new BacThongThuong("2", 50, 100, 1866);
        TienDienBacThang b3 = new BacThongThuong("3",100 , 200, 2167);
        TienDienBacThang b4 = new BacThongThuong("4", 200, 300, 2729);
        TienDienBacThang b5 = new BacThongThuong("5", 300, 400, 3050);
        TienDienBacThang b6 = new BacCaoNhat("6", 400, Integer.MAX_VALUE, 3151);

        b1.keTiep(b2).keTiep(b3).keTiep(b4).keTiep(b5).keTiep(b6);
        System.out.println(b1.tinhTien(500));
    }
}
