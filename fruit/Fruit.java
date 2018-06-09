package fruit;

public abstract class Fruit {
    private double weight;
    private double price;

    public Fruit(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public Fruit() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public final void printManufacturerInfo(){
        System.out.print("Made in Ukraine");
    }

    public abstract double getPriceFruit();
}
