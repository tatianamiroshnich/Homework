public class Factorial {
    public static void main(String[] args) {
        double a1 = Math.random() * 10;
        int a2 = (int) a1;
        System.out.println(a2 + "!=" + getFactorial(a2));
    }

    public static int getFactorial(int d) {
        int result = 1;
        for (int i = 1; i <= d; i++) {
            result = result * i;
        }
        return result;
    }
}
