package company.vehicles;

import company.details.Engine;
import company.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String carClass, String type, Engine engine, Driver driver, double speed) {
        super(carClass, type, engine, driver);
        this.speed = speed;
    }

    public SportCar(){

    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void start() {
        System.out.println("Sport car start");
    }

    @Override
    public void stop() {
        System.out.println("Sport car stop");

    }

    @Override
    public void turnRight() {
        System.out.println("Sport car turn left");
    }

    @Override
    public void turnLeft() {
        System.out.println("Sport car turn right");
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("sportCarSpeed= " + getSpeed());
    }
}
