package clothes;

public class Pants extends Clothes implements ManClothes, WomanClothes {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void wearMan() {
        System.out.println("Одеваю на мужчину " + this);
    }

    @Override
    public void wearWoman() {
        System.out.println("Одеваю на женщину " + this);
    }

    @Override
    public String toString() {
        return "Pants{} " + super.toString();
    }
}
