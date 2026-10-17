package predavanje_12_10_2026;

public class Zadatak5 {
    public static void main(String[] args) {
        String prvi = "Java";
        String drugi = "Programiranje";

        String kombinovano = prvi + " " + drugi;
        System.out.println("Kombinovano: " + kombinovano);
        System.out.println("Duzina: " + kombinovano.length());
        System.out.println("Velika slova: " + kombinovano.toUpperCase());
        System.out.println("Sadrzi 'Java'? " + kombinovano.contains("Java"));

        String prvii = "Danas";
        String drugii = "je";
        String treci = "lijep";
        String cetvrti = "dan";

        String recenica = prvii + " " + drugii + " " + treci + " " + cetvrti;
        System.out.println("\nRecenica: " + recenica);
        System.out.println("Mala slova: " + recenica.toLowerCase());

        System.out.println();
        System.out.println(recenica);
        System.out.println();
        System.out.println(recenica.substring(15, 18));
        System.out.println(recenica.substring(6, 8));
        System.out.println(recenica.substring(9, 14));
        System.out.println(recenica.toLowerCase().substring(0, 5));

        System.out.println();
        System.out.println(recenica.toUpperCase().charAt(1));
        System.out.println(recenica.toUpperCase().charAt(6));
        System.out.println(recenica.toUpperCase().charAt(0));
        System.out.println(recenica.toUpperCase().charAt(10));
        System.out.println(recenica.toUpperCase().charAt(2));

        char prvi1 = recenica.charAt(0);
        char drugi1 = recenica.charAt(recenica.length()-1);
        System.out.printf("\nPrvi znak: %c, zadnji znak: %c\n", prvi1, drugi1);

        String tajni = recenica.substring(0,9) + "@l73R" + recenica.substring(14);
        System.out.printf("Tajni kod: %s", tajni);
    }

}
