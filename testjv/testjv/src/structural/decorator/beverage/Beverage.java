package structural.decorator.beverage;

public abstract class Beverage {
    String description;
    public abstract int cost();

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
