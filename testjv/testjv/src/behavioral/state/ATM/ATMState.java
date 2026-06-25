package behavioral.state.ATM;

public interface ATMState {
    void moneyInHandle(int amount, ATM atm);
    void moneyOutHandle(ATM atm);
}
