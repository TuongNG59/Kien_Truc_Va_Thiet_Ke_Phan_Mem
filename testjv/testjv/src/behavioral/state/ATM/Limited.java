package behavioral.state.ATM;

import java.util.Scanner;

public class Limited implements ATMState {
    int max = 10000000;
    @Override
    public void moneyInHandle(int amount, ATM atm) {
        atm.balance += amount;

        if(atm.balance > max){
            atm.state = new Ready();
            System.out.println("Chuyen sang trang thai Ready");
        }
    }

    @Override
    public void moneyOutHandle(ATM atm) {
        System.out.println("So tien toi da co the rut la 10tr");
        if(atm.balance == 0){
            atm.state = new NoMoney();
            System.out.println("Chuyen sang trang thai NoMoney");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien muon rut (Khong vuot qua " + atm.balance + "): ");
        int amount = scanner.nextInt();

        if(amount > atm.balance){
            System.out.println("So du ko du");
            return;
        }

        atm.balance -= amount;
        System.out.println("Rut thanh cong "+ amount);
        System.out.println("So du con lai "+atm.balance);

        if (atm.balance == 0){
            atm.state = new NoMoney();
            System.out.println("Chuyen sang trang thai NoMoney");
        }
    }
}
