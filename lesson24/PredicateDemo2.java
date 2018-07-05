package lesson24;

import java.util.function.Predicate;

/**
 * Created by student on 05.07.2018.
 */
public class PredicateDemo2 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = str -> str.startsWith("J");
        Predicate<String> predicate2 = str -> str.startsWith("N");
        Predicate<String> predicate3 = str -> str.endsWith("A");

        Predicate<String> predicate = predicate1.or(predicate2).and(predicate3);

        System.out.println(predicate.test("JAVA"));
        System.out.println(predicate.test("NAVA"));
        System.out.println(predicate.test("AVA"));
    }
}
