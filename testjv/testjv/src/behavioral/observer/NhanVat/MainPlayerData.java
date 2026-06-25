package behavioral.observer.NhanVat;

public class MainPlayerData {
    static void main(String[] args) {
        PlayerData playerData = new PlayerData(300,5,0);
        Dashboard dashboard = new Dashboard(playerData);

        playerData.setDiemSo(100);
        playerData.setThoiGian(250);
        playerData.setSoLuotChoi(4);

        playerData.setDiemSo(600);

    }
}
