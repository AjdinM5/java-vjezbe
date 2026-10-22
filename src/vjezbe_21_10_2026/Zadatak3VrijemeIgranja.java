package vjezbe_21_10_2026;

public class Zadatak3VrijemeIgranja {
    public static void main(String[] args) {
        int ukupnoSekundi = 200000;

        int dani = ukupnoSekundi / 86400;
        int ostatak = ukupnoSekundi % 86400;

        int sati = ostatak / 3600;
        ostatak = ostatak % 3600;

        int minute = ostatak / 60;
        int sekunde = ostatak % 60;

        System.out.println(ukupnoSekundi + " s = " + dani + " d, " + sati + " h, "
                + minute + " min, " + sekunde + " s");

        boolean viseOdJednogDana = ukupnoSekundi >=86400;
        System.out.println("Više od jednog dana: " + viseOdJednogDana);
    }
}
