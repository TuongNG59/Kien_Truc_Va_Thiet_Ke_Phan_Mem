package structural.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast("Cà phê Trung Nguyên");

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Milk("Sữa cô gái Hà Lan", beverage);
        System.out.println("Lần 1");
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Milk("Sữa ông Thọ", beverage);
        System.out.println("\nLần 2");
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());


    }
}
