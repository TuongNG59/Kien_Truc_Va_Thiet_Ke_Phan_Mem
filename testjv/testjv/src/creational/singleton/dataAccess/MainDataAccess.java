package creational.singleton.dataAccess;

public class MainDataAccess {
    public static void main(String[] args) {
        DataAccess ui1 = DataAccess.getInstance();
        DataAccess ui2 = DataAccess.getInstance();
        ui1.add(new SanPham("001","Keo Kon", 3000000 ));
        ui1.add(new SanPham("002","Banh hang",500000));
        ui2.add(new SanPham("001","Ovanteen",10000));
    }
}
