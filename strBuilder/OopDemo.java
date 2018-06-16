package strBuilder;

public class OopDemo {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder(("object oriented programming is my life object " +
                "oriented programming").toLowerCase());
        replacement(s1);
    }

    public static void replacement(StringBuilder str) {
        String s1 = "object oriented programming";
        while (str.indexOf(s1) != -1) {
            int k1 = str.indexOf("object oriented programming");
            int k2 = k1 + s1.length();
            str = str.replace(k1, k2, "oop");
        }
        System.out.println(str);
    }
}
