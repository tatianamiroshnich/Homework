public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void talk() {
        System.out.println(fullName + " говорит.");
    }

    void move() {
        System.out.println(fullName + " двигается.");
    }
}
