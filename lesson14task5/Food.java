package lesson14task5;

/**
 * Created by student on 05.07.2018.
 */
public class Food {
    public void prepare(Cookable c) {
        c.cook();
    }

    public static void main(String[] args) {
        Food food1 = new Food();
        Cookable cookable = () -> System.out.println("Fried");
        food1.prepare(cookable);
    }
}
