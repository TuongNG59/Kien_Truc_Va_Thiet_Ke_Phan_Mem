package behavioral.state.ATM;

public class ATM {
    int balance;
    ATMState state;

    public ATM(int balance) {
        this.balance = balance;
        if (balance == 0) {
            state = new NoMoney();
        }
        else if (balance < 20000){
            state = new Limited();
        }
        else{
            state = new Ready();
        }
    }

    void moneyIn(int balance){
        this.balance += balance;
        state.moneyInHandle(balance, this);
    }

    void moneyOut(){
        state.moneyOutHandle(this);
    }
}
