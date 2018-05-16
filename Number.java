import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if(i%2==0){
                    System.out.println("Вы ввели четное число");
                } else {
                    System.out.println("Вы ввели нечетное число");
                }
            } else {
                System.out.println("Вы ввели не целое число");
            }
        }


}
