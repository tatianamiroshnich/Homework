import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args) {
        System.out.print("Введите 3 целых числа: ");
        int j1 = getNumber();
        int j2 = getModule(j1);
        int k1 = getNumber();
        int k2 = getModule(k1);
        int l1 = getNumber();
        int l2 = getModule(l1);

        int m = j2<k2?(j2<l2?j2:l2):(k2<l2?k2:l2);

        System.out.println("меньшее по модулю: " + m);
    }
    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            return i;

        } else {
            System.out.println("Вы ввели не целое число");
        }

        return 0;
    }
    public static int getModule(int i){
        int k;
        k = i < 0 ? -i : i;
        return k;
    }
}
