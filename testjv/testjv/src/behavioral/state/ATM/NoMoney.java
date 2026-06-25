package behavioral.state.ATM;

public class NoMoney implements ATMState {
    int max = 10000000;
    @Override
    public void moneyInHandle(int amount, ATM atm) {
        atm.balance += amount;

        if(atm.balance > max){
            atm.state = new Ready();
            System.out.println("Chuyen sang trang thai Ready");
        }
        else{
            atm.state = new Limited();
            System.out.println("Chuyen sang trang thai Limited");
        }
    }

    @Override
    public void moneyOutHandle(ATM atm) {
        System.out.println("Trang thai hien tai: NoMoney");
        System.out.println("Khong the rut vi so du = 0");
    }
}
