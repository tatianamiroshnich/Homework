package strBuilder;

public class MiddleSymbol {
    public static void main(String[] args) {
        middle("leto");
        middle("Practice");
        middle("нечет");
    }

    public static void middle(String str) {
        if (str.length() % 2 == 0) {
            int k = str.length() / 2 - 1;
            System.out.print(str.charAt(k));
            System.out.println(str.charAt(k + 1));
        } else {
            System.out.println("длина строки - нечетное число");
        }
    }
}
