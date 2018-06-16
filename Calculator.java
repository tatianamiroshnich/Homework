/**
 * Created by student on 13.06.2018.
 */
public class Calculator {
    public static <T extends Number, V extends Number> Double sum(T value1, V value2) {
        return value1.doubleValue() + value2.doubleValue();
    }

    public static <T extends Number, V extends Number> Double subtraction(T value1, V value2) {
        return value1.doubleValue() - value2.doubleValue();
    }

    public static <T extends Number, V extends Number> Double multiply(T value1, V value2) {
        return value1.doubleValue() * value2.doubleValue();
    }

    public static <T extends Number, V extends Number> Double divide(T value1, V value2) {
        return value1.doubleValue() / value2.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(sum(12, 13.5));
        System.out.println(subtraction(12, 13.5));
        System.out.println(multiply(12, 13.5));
        System.out.println(divide(12, 13.5));
    }
}
