import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 2 целых числа: ");
        if (scanner.hasNextInt()) {
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            int sum = i1+i2;
            System.out.println("Сумма: " + sum);

        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
