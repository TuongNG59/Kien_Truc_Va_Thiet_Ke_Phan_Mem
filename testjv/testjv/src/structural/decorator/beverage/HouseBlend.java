package structural.decorator.beverage;

public class HouseBlend extends Beverage{
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 30;
    }
}
