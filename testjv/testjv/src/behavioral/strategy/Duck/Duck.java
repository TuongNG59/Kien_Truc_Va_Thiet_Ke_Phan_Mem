package behavioral.strategy.Duck;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void display() {

    }

    public void swim(){
        System.out.println("Bơi...");
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
