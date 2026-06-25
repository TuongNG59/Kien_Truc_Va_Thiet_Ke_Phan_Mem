package behavioral.strategy.Duck;

public class SQuack implements
 QuackBehavior{
    @Override
    public void quack() {
        System.out.println("1...2...3...Zoo");
    }
}
