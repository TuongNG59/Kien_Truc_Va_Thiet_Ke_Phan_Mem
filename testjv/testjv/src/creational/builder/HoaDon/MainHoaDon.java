package creational.builder.HoaDon;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .buildHeader("001", "29/9/2005", "Thành Đạt")
                .addCTHD("Vàng 9999", 125_000_000, 1, 0.05f)
                .addCTHD("Vịt nướng", 200_000, 2, 0)
                .addCTHD("Chiếu ngủ", 300_000, 1, 0)
                .build();
        System.out.println(hoaDon.toString());
    }
}
