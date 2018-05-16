
public class Literals {
    public static void main(String[] args) {
        /*Создать программу, в которой используются
        одно-строчные и много-строчные комментарии
         */
        double d = 0.768;  //литерал типа double
        float f = 0.7f;    //литерал типа float
        char c = 'c';       // символьный
        boolean b = true;   //логический литерал
        int i1 = 0b001;     // целочисленный 2-й
        int ten = 012;      //целочисленный 8-й
        int x = -333;       //целочисленный 10-й
        int a = 0x004;      //целочисленный 16-й
        String str = "Hello!";   //строковый

        System.out.println(str + " " +d + " " + f + " " + c + " " + b + " " + i1 + " " +
        ten + " " + x + " " + a);
    }
}
