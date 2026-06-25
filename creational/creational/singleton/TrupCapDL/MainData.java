package creational.singleton.TrupCapDL;

public class MainData {
    public static void main(String[] args) {
        dataAccess ui1 = dataAccess.getInstance();
        dataAccess ui2 = dataAccess.getInstance();
        ui1.them(new SanPham("kera","Keo kera",15,3500));
        ui1.them(new SanPham("st1","banh oishi",5,5500));
        ui2.them(new SanPham("st3","Keo oi",55,8500));
        ui1.them(new SanPham("st4","banh u",75,12500));
        System.out.println("-------------D1--------------");
        ui1.display();
        System.out.println("-------------D2--------------");
        ui2.display();

    }
}
