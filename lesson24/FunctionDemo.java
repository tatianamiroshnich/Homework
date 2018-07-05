package lesson24;

import java.util.function.Function;

/**
 * Created by student on 05.07.2018.
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = str -> {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException e) {
                return 0;
            }
        };
        System.out.println(123);
        System.out.println("abc");
    }
}
