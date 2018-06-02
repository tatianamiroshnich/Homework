package company.vehicles;

import company.details.Engine;
import company.professions.Driver;

public class Car {
    private String carClass, type;
    private Engine engine;
    private Driver driver;

    public Car(String carClass, String type, Engine engine, Driver driver) {
        this.carClass = carClass;
        this.type = type;
        this.engine = engine;
        this.driver = driver;
    }

    public Car() {
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void start() {
        System.out.println("Car start");
    }

    public void stop() {
        System.out.println("Car stop");

    }

    public void turnRight() {
        System.out.println("Car turn left");
    }

    public void turnLeft() {
        System.out.println("Car turn right");
    }

    public void printInfo() {
        System.out.println("carClass=" + carClass + " type=" + type);

        if (driver != null) {
            System.out.println("driver=" + driver.getFullName() + " " + driver.getAge() + " " +
                    driver.getExperience());
        }

        if (engine!=null){
            System.out.println("engine=" + engine.getCompany() + " " + engine.getPower());
        }
    }
}
