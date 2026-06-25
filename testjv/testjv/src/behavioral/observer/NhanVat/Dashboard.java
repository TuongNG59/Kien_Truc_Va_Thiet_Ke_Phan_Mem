package behavioral.observer.NhanVat;

public class Dashboard implements PlayerDataListener {
    PlayerData playerData;

    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
        playerData.dangKy(this);
    }

    @Override
    public void listen(PlayerData data) {
        System.out.println("Dashboard");
        System.out.println("Thoi gian: " + data.getThoiGian());
        System.out.println("So luot choi: "+ data.getSoLuotChoi());
        System.out.println("So diem: " +data.getDiemSo());
    }
}
