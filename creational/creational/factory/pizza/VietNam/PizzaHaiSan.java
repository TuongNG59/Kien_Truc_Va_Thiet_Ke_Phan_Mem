package creational.factory.pizza.VietNam;

import creational.factory.pizza.Pizza;

public class PizzaHaiSan extends Pizza {

    @Override
    public void prepare() {
        this.getBuilder().append("Chuan bi bot, muc, tom");
    }

    @Override
    public void bake() {
        this.getBuilder().append("\nNuong tren lo than 180 do C trong 15p");
    }

    @Override
    public void cut() {
        this.getBuilder().append("\nCat banh ra lam 6 phan");
    }

    @Override
    public void box() {
        this.getBuilder().append("\nGoi bang la chuoi, bo vao hop.");
    }
}
