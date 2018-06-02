package company.vehicles;

import company.details.Engine;
import company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String carClass, String type, Engine engine, Driver driver, int carrying) {
        super(carClass, type, engine, driver);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public void start() {
        System.out.println("Lorry start");
    }

    @Override
    public void stop() {
        System.out.println("Lorry stop");

    }

    @Override
    public void turnRight() {
        System.out.println("Lorry turn left");
    }

    @Override
    public void turnLeft() {
        System.out.println("Lorry turn right");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("lorryCarying=" + getCarrying());
    }
}
