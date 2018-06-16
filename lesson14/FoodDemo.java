package lesson14;

public class FoodDemo {
    public static void main(String[] args) {
        Cookable cookable = new Cookable() {
            @Override
            public void cook() {
                System.out.println("Anonymous class");
            }
        };
        cookable.cook();
    }
}

