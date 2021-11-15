package fundamentos;

public class ConversionTypePrimitiveToNumber {
    public static void main(String[] args) {
        double a = 1;
        System.out.println(a);

        float b = (float) 1.258; // explicita (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c;// explicita (CAST)
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);

    }
}
