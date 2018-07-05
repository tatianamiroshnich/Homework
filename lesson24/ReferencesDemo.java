package lesson24;

import java.util.function.IntFunction;

/**
 * Created by student on 05.07.2018.
 */
public class ReferencesDemo {
    public static void main(String[] args) {
        IntFunction<String> function = String::valueOf;
        System.out.println(function.apply(450));
    }


}
