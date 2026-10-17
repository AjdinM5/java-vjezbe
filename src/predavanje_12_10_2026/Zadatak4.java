package predavanje_12_10_2026;

public class Zadatak4 {
    public static void main(String[] args) {
        int x = 130;
        byte y = (byte) x;
        double rezultat = 10 / 3.0;

        System.out.printf("x = %d\n", x);
        System.out.printf("Nakon pretvaranja u byte: y = %d\n", y);
        System.out.printf("10 / 3.0 = %.2f\n", rezultat);

        double d=55.5;
        int z= (int) d;
        System.out.printf("Double: %.1f , int: %d\n", d, z);

        byte max = 127;
        byte a = (byte) (max+1);
        System.out.printf("127 + 1 u byte = %d", a);
    }
}
