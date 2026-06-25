package behavioral.command.dinner;

public class Order implements IOrder {
    String foodName;
    int quality;
    Chef chef;

    public Order(String foodName, int quality, Chef chef) {
        this.foodName = foodName;
        this.quality = quality;
        this.chef = chef;
    }

    @Override
    public void oder() {}
}
