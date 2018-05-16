public class Ternary {
    public static void main(String[] args) {
        int j, k, l, m;

        j = getModule(5);
        k = getModule(-3);
        l = getModule(15);

        m = j<k?(j<l?j:l):(k<l?k:l);
        System.out.println("меньшее по модулю: " + m);


    }

    public static int getModule(int i){
        int k;
        k = i < 0 ? -i : i;
        return k;
    }
}

