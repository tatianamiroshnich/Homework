public class Convert {

    boolean t = true;

    public static void checkByte() {
        byte b = 10;
        int a1 = b;
        short a2 = b;
        char a3 = (char) b;
        long a5 = b;
        float a6 = b;
        double a7 = b;
    }

    public static void checkInt() {
        int i = 867;
        short a2 = (short) i;
        char a3 = (char) i;
        long a5 = i;
        float a6 = i;
        double a7 = i;
        byte a8 = (byte) i;
    }

    public static void checkShort() {
        short s = 555;
        int a1 = s;
        char a3 = (char) s;
        long a5 = s;
        float a6 = s;
        double a7 = s;
        byte a8 = (byte) s;
    }

    public static void checkChar() {
        char c = 'c';
        int a1 = c;
        short a2 = (short) c;
        long a5 = c;
        float a6 = c;
        double a7 = c;
        byte a8 = (byte) c;
    }

    public static void checkLong() {
        long l = 1234;
        int a1 = (int) l;
        short a2 = (short) l;
        char a3 = (char) l;
        float a6 = l;
        double a7 = l;
        byte a8 = (byte) l;
    }

    public static void checkFloat() {
        float f = 76.4f;
        int a1 = (int) f;
        short a2 = (short) f;
        char a3 = (char) f;
        long a5 = (long) f;
        double a7 = f;
        byte a8 = (byte) f;
    }

    public static void checkDouble() {
        double d = 34.89;
        int a1 = (int) d;
        short a2 = (short) d;
        char a3 = (char) d;
        long a5 = (long) d;
        float a6 = (float) d;
        byte a8 = (byte) d;
    }
}
