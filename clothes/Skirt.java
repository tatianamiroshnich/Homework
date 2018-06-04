package clothes;

public class Skirt extends Clothes implements WomanClothes {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void wearWoman() {
        System.out.println("Одеваю на женщину " + this);
    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}
