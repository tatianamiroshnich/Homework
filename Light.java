public class Light {
    public static void main(String[] args) {
        int a1 = 192;
        System.out.println(Integer.toBinaryString(a1));
        int k = runLights(a1);
        System.out.println(Integer.toBinaryString(k));

      /*  public static int runLights(int i){
            int a1 = 56;
            int a2 = ~a1;
            System.out.println(Integer.toBinaryString(a1));
            System.out.println(Integer.toBinaryString(a2));
        }
*/
    }
        public static int runLights(int i){
            for(i=0;i<10;i++){
                i = i<<1;
                System.out.println(Integer.toBinaryString(i));
            }
            return i;
        }

    }

