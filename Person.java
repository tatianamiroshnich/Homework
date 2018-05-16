public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void talk(String person) {
        System.out.println(person + " говорит.");
    }

    void move(String person) {
        System.out.println(person + " двигается.");
    }
}
