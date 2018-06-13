/**
 * Created by student on 13.06.2018.
 */
public class Calculator {
    public static <T extends java.lang.Number, V extends java.lang.Number> Double sum(T value1, V value2) {
        return value1.doubleValue() + value2.doubleValue();
    }
    public static <T extends java.lang.Number, V extends java.lang.Number> Double v(T value1, V value2) {
        return value1.doubleValue() + value2.doubleValue();
    }
    public static <T extends java.lang.Number, V extends java.lang.Number> Double u(T value1, V value2) {
        return value1.doubleValue() + value2.doubleValue();
    }
    public static <T extends java.lang.Number, V extends java.lang.Number> Double d(T value1, V value2) {
        return value1.doubleValue() + value2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(12,13.5));
    }
}
