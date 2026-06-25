package structural.decorator.beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return super.cost() +10;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", "+ this.description;
    }
}
