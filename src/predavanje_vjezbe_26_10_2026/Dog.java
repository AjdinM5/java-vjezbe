package predavanje_vjezbe_26_10_2026;
// Klasa Dog
public class Dog {
    private String ime;
    private String pasmina;
    private int dob;

    // Konstruktor
    public Dog(String ime, String pasmina, int dob) {
        this.ime = ime;
        this.pasmina = pasmina;
        this.dob = dob;
    }

    // Get metode
    public String getIme() {
        return ime;
    }

    public String getPasmina() {
        return pasmina;
    }

    public int getDob() {
        return dob;
    }

    // Set metode
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPasmina(String pasmina) {
        this.pasmina = pasmina;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }


}
