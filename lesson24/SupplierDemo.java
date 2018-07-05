package lesson24;

import java.util.function.Supplier;

/**
 * Created by student on 05.07.2018.
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> supplier = () -> Math.random()*10;
        System.out.println(supplier.get());
    }
}
