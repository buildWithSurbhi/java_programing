class ninth {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;

    public static void main(String[] args) {
        System.out.println(b + " " + Byte.BYTES);
        System.out.println(s + " " + Short.BYTES);
        System.out.println(i + " " + Integer.BYTES);
        System.out.println(l + " " + Long.BYTES);
        System.out.println(f + " " + Float.BYTES);
        System.out.println(d + " " + Double.BYTES);
        System.out.println(c);
        System.out.println(bool);
    }
}

