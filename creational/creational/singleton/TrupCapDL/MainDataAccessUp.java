package creational.singleton.TrupCapDL;

public class MainDataAccessUp {
    public static void main(String[] args) {
        DataAccessUpgrade d1 = DataAccessUpgrade.getInstance("tag1");
        DataAccessUpgrade d2 = DataAccessUpgrade.getInstance("tag1");
        DataAccessUpgrade d3 = DataAccessUpgrade.getInstance("tag2");
        d1.them(new SanPham("kera","Keo kera",15,3500));
        d2.them(new SanPham("st1","banh oishi",5,5500));
        d3.them(new SanPham("st3","Keo oi",55,8500));
        System.out.println("-------------D1--------------");
        d1.display();
        System.out.println("-------------D2--------------");
        d2.display();
        System.out.println("-------------D3--------------");
        d3.display();
    }
}
