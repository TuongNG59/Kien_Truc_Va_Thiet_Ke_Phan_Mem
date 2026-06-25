package behavioral.state.ATM;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM(30000);

        System.out.println("Trạng thái ban đầu ");
        System.out.println("Balance: " + atm.balance);

        System.out.println("\nRut lan 1 ");
        atm.moneyOut();

        System.out.println("\nRut lan 2");
        atm.moneyOut();

        System.out.println("\nRut lan 3");
        atm.moneyOut();

        System.out.println("\nNap 10k ");
        atm.moneyIn(10000);

        System.out.println("\nNap 50k");
        atm.moneyIn(50000);

        System.out.println("\nRut lan 4");
        atm.moneyOut();

        System.out.println("\nRut lan 5");
        atm.moneyOut();
    }
}
