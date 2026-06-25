package creational.builder.A1_Hoa_Don;

public class MainHD {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder()
                .buildHeader("001","09/05/2025","Nguyen Van A")
                .addCTHD("banh ngot",15,6000, 5.6F)
                .addCTHD("Vit nuong",200_000,2,0.26f)
                .addCTHD("Day chuyen", 500_000,5,0.1f)
                .build();
        System.out.println(hd.toString());
    }
}
