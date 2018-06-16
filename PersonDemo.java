public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Jack Jones", 45);
        Person person2 = new Person();
        person2.fullName = "Anna Smith";

        person1.talk();
        person2.move();
    }
}
