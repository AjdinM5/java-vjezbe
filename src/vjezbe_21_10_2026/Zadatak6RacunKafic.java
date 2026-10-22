package vjezbe_21_10_2026;

public class Zadatak6RacunKafic {
    public static void main(String[] args) {
        double kafa = 2.50;
        double sok = 3.20;
        double kolac = 4.80;

        final double PDV = 0.17;
        final int BROJ_OSOBA = 4;

        double ukupno = (3 * kafa) + (2 * sok) + kolac;

        System.out.printf("Ukupno: %.2f KM\n", ukupno);

        double osnovica = ukupno / (1+PDV)/*1.17*/;
        double pdv=ukupno-osnovica;
        System.out.printf("Osnovica: %.2f KM\nPDV je: %.2f KM\n", osnovica, pdv);

        double napojnica = ukupno * 1.10;
        System.out.printf("Napojnica: %.2f KM\n", napojnica);

        double poOsobi = napojnica / BROJ_OSOBA /*4*/;
        System.out.printf("Po osobi: %.2f KM\n", poOsobi);

        int poOsobiZaokruzeno = (int) Math.ceil(poOsobi);
        System.out.printf("Po osobi zaokruženo na više: %d KM\n", poOsobiZaokruzeno);

        System.out.printf("\n---------------- RAČUN ----------------\n");
        System.out.printf("%-25s %10.2f KM\n", "Ukupno: ", ukupno);
        System.out.printf("%-25s %10.2f KM\n", "Osnovica: ", osnovica);
        System.out.printf("%-25s %10.2f KM\n", "PDV 17%: ", pdv);
        System.out.printf("%-25s %10.2f KM\n", "Ukupno sa napojnicom: ", napojnica);
        System.out.printf("%-25s %10.2f KM\n", "Po osobi: ", poOsobi);
        System.out.printf("%-25s %10d KM\n", "Po osobi (zaokruženo): ", poOsobiZaokruzeno);
        System.out.printf("---------------------------------------\n");


    }

}
