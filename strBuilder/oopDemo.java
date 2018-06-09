package strBuilder;

public class oopDemo {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Object oriented programming is my life object oriented programming");
        replacement(s1);
    }

    public static void replacement(StringBuffer str) {
        String s1 = "object oriented programming";
        if (str.indexOf(s1) != -1) {
            int k1 = str.indexOf("object oriented programming");
            int k2 = k1 + s1.length();
            str = str.replace(k1, k2, "oop");
            System.out.println(str);
        } else {
            System.out.println(str);
        }
    }
}
