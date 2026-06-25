package creational.factory.pizza;

import creational.factory.pizza.VietNam.VNPizzaStore;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore ps = new VNPizzaStore();
        Pizza p = ps.orderPizza(PizzaType.HAISAN);
        System.out.println(p.toString());
    }
}
