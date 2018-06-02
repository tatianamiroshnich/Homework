package company;

import company.details.Engine;
import company.professions.Driver;
import company.vehicles.Car;
import company.vehicles.Lorry;
import company.vehicles.SportCar;

public class CarDemo {
    public static void main(String[] args) {
        Engine engine1 = new Engine(45,"Company1");
        Driver driver1 = new Driver("Ivanov",45,20);
        Car car = new Car("class1","type1",engine1,driver1);
        car. start();
        car.stop();
        car.turnRight();
        car.turnLeft();
        car.printInfo();
        System.out.println();

        Engine engine2 = new Engine(40,"Company2");
        Driver driver2 = new Driver("Petrov",35,10);
        Lorry lorry = new Lorry("class2","type2",engine2,driver2,1000);
        lorry. start();
        lorry.stop();
        lorry.turnRight();
        lorry.turnLeft();
        lorry.printInfo();
        System.out.println();

        Engine engine3 = new Engine(30,"Company3");
        Driver driver3 = new Driver("Morshin",25,5);
        SportCar sportCar = new SportCar("class3","type3",engine3,driver3,250);
        sportCar.start();
        sportCar.stop();
        sportCar.turnRight();
        sportCar.turnLeft();
        sportCar.printInfo();
        System.out.println();

    }
}
