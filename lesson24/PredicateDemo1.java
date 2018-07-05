package lesson24;

import java.util.function.Predicate;

/**
 * Created by student on 05.07.2018.
 */
public class PredicateDemo1 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = str->str != null;
        Predicate<String> predicate2 = str->!str.isEmpty();
        Predicate<String> predicate3 = predicate1.and(predicate2);

        System.out.println(predicate3.test(null)) ;
        System.out.println(predicate3.test(" vnjf")) ;
        System.out.println(predicate3.test("")) ;
    }
}
