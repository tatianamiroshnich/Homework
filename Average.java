public class Average {
    public static void main(String[] args) {
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        double number3 = Double.parseDouble(args[2]);
        double average = (number1+number2+number3)/3;

        System.out.println("Среднее значение трех вещественных чисел: " + average);
    }
}
