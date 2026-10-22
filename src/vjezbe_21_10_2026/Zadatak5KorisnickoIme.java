package vjezbe_21_10_2026;

public class Zadatak5KorisnickoIme {
    public static void main(String[] args) {
        String ime = "Amila";
        String prezime = "Tabak";
        String prezime2 = "Hodžić";
        int godinaRodjenja = 2006;


        String prvoSlovo = ime.substring(0,1);

        String godinaTekst = "" + godinaRodjenja;

        String zadnjeDvijeCifre = godinaTekst.substring(2);

        String korisnickoIme = (prvoSlovo + prezime + zadnjeDvijeCifre).toLowerCase();

        System.out.println("Korisničko ime: " + korisnickoIme);


        System.out.println("Dužina: " + korisnickoIme.length());

        System.out.println("Inicijali: " + ime.substring(0,1) + "." + "" + prezime.substring(0,1) + ".");
        String tajniKod = "JAVA";
        System.out.println("Tajni kod: " + tajniKod.charAt(3) + tajniKod.substring(1, 3) +tajniKod.charAt(0));

        String prezimeBezKvakica = (prvoSlovo + prezime2 + zadnjeDvijeCifre).toLowerCase().replace("ž", "z")
                .replace("ć", "c").replace("č", "c").replace("š", "s")
                        .replace("đ", "dj");
        System.out.println("Korisničko ime: " + prezimeBezKvakica);
    }
}
