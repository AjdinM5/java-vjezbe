package vjezbe_21_10_2026;

public class Zadatak4ProsjekOcjena {
    public static void main(String[] args) {
        int o1 = 9, o2 = 8, o3 = 10, o4 = 7, o5 = 9;


        int zbir = o1 + o2+ o3 + o4 + o5;

        int prosjek = zbir/5;

        double prosjek2 = zbir/5.0;

        long zaokruzi = Math.round(prosjek2);

        boolean imaStipendiju = prosjek2 >=8.5;

        System.out.println("Zbir: " + zbir);
        System.out.println("Prosjek (int): " + prosjek);
        System.out.println("Prosjek (double): " + prosjek2);
        System.out.println("Zaokruženo: " + zaokruzi);
        System.out.printf("Prosjek: %.2f\n", prosjek2);
        System.out.println("Stipendija: " + imaStipendiju);

    }

}
