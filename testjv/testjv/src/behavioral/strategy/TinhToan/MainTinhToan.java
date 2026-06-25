package behavioral.strategy.TinhToan;

import javax.naming.Context;

public class MainTinhToan {
    public static void main(String[] args) {
        context con = new context();

        con.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + con.tinh(75, 12));


        con.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + con.tinh(54, 78));
    }
}
