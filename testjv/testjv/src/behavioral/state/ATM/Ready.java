package behavioral.state.ATM;

import java.util.Scanner;

public class Ready implements ATMState {
    int max = 10000000;
    @Override
    public void moneyInHandle(int amount, ATM atm) {
        atm.balance += amount;
    }

    @Override
    public void moneyOutHandle(ATM atm) {
        System.out.println("Nhap vao so tien rut, toi da 10tr:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        if(amount > max) {
            System.out.println("Khong the rut qua " + max);
            return;
        }

        if(amount < atm.balance) {
            System.out.println("Khong du tien de rut");
        }

        atm.balance -= amount;
        if(atm.balance == 0)
            atm.state = new NoMoney();
        else if (atm.balance<20000) {
            atm.state = new Limited();
        }
    }
}
