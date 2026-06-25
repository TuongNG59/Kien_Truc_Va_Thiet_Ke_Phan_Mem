package behavioral.strategy.Duck;

public class BBQ_Duck extends Duck{
    @Override
    public void display() {
        System.out.println("Vịt quay Bắc King Julian");
        performFly();
        performQuack();
        System.out.println("Chúc ngon...");
    }
}
