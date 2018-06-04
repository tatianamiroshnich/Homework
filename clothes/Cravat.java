package clothes;

public class Cravat extends Clothes implements ManClothes {
    public Cravat(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void wearMan() {
        System.out.println("Одеваю на мужчину " + this);
    }

    @Override
    public String toString() {
        return "Cravat{} " + super.toString();
    }
}
