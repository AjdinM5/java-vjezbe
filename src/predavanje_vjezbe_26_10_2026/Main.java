package predavanje_vjezbe_26_10_2026;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Array List
    static ArrayList<Dog> psi = new ArrayList<>();

    // Metoda za unos
    public static Dog unesiPsa (Scanner sc) {
        System.out.println("Unesite ime psa: ");
        String ime = sc.nextLine();

        System.out.println("Unesite pasminu psa: ");
        String pasminu = sc.nextLine();

        System.out.println("Unesite dob psa: ");
        int dob = sc.nextInt();
        sc.nextLine();

        return new Dog(ime, pasminu, dob);
    }

    // Metoda za ispis
    public static void ispisiPse() {
        if(psi.isEmpty()) {
            System.out.println("Nema unesenih pasa.");
        } else {
            for (int i=0; i<psi.size(); i++) {
                System.out.println("---------------------------------------");
                System.out.println("Ime: " + psi.get(i).getIme());
                System.out.println("Pasmina: " + psi.get(i).getPasmina());
                System.out.println("Dob: " + psi.get(i).getDob() + " godina");
            }
        }

    }

    // Metoda za pretrazivanje
    public static void pretraziPsa(Scanner sc) {
        if (psi.isEmpty()) {
            System.out.println("Nema unesenih pasa.");
            return;
        }

        System.out.println("Unesite ime psa kojeg zelite pronaci: ");
        String trazeni = sc.nextLine();

        for (int i=0; i<psi.size(); i++) {
            if (psi.get(i).getIme().equalsIgnoreCase(trazeni)) {
                System.out.println("Pas " + trazeni + " je pronadjen.");
                System.out.println("Ime: " + psi.get(i).getIme());
                System.out.println("Pasmina: " + psi.get(i).getPasmina());
                System.out.println("Dob: " + psi.get(i).getDob() + " godina");
                return;

            }

        }
        System.out.println("Pas sa imenom " + trazeni + " nije pronadjen.");
    }

    // Metoda za azuriranje psa
    public static void azuriranjePsa(Scanner sc) {
        if (psi.isEmpty()) {
            System.out.println("Nema unesenih pasa.");
            return;
        }

        System.out.println("Unesite ime psa kojeg zelite pronaci: ");
        String trazeni = sc.nextLine();

        for (int i=0; i<psi.size(); i++) {
            if (psi.get(i).getIme().equalsIgnoreCase(trazeni)) {
                System.out.println("Pas " + trazeni + " je pronadjen. Sta zelite izmjeniti?");
                System.out.println("1. Ime");
                System.out.println("2. Pasminu");
                System.out.println("3. Dob");
                System.out.println("4. Sve");
                System.out.println("Birate opciju: ");
                int izbor = sc.nextInt();
                sc.nextLine();


                // Ovdje sam svaki case izolovao viticastim zagradama, jer svi case-ovi u switch-u dijele isti prostor,
                // pa bi se String ime, String pasmina i int dob iz case 4 sukobili s istim imenima iz case 1,2 i 3.
                // Alternativa: varijable u case 4 preimenovati tako da nisu iste kao u case 1,2 i 3. Tada nisu potrebne viticaste zagrade
                switch (izbor) {
                    case 1:{
                        System.out.println("Unesite novo ime: ");
                        String ime = sc.nextLine();
                        psi.get(i).setIme(ime);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Unesite novu pasminu: ");
                        String pasmina = sc.nextLine();
                        psi.get(i).setPasmina(pasmina);
                        break;
                }
                    case 3:
                    {
                        System.out.println("Unesite novu dob: ");
                        int dob = sc.nextInt();
                        sc.nextLine();
                        psi.get(i).setDob(dob);
                        break;
            }
                    case 4:
                    {
                        System.out.println("Unesite novo ime: ");
                        String ime = sc.nextLine();
                        psi.get(i).setIme(ime);

                        System.out.println("Unesite novu pasminu: ");
                        String pasmina = sc.nextLine();
                        psi.get(i).setPasmina(pasmina);

                        System.out.println("Unesite novu dob: ");
                        int dob = sc.nextInt();
                        sc.nextLine();
                        psi.get(i).setDob(dob);
                        break;
        }
                    default:
                        System.out.println("Pogresan izbor. (1-4)");
                        return;
                }
                System.out.println("Podaci o psu su izmjenjeni.");
                return;

            }


        }
        System.out.println("Pas sa imenom " + trazeni + " nije pronadjen.");
    }

    // Metoda za adoptiranje (brisanje) psa
    public static void adoptiranjePsa(Scanner sc) {
        if (psi.isEmpty()) {
            System.out.println("Nema unesenih pasa.");
            return;
        }

        System.out.println("Unesite ime psa kojeg zelite adoptirati: ");
        String trazeni = sc.nextLine();

        for (int i=0; i<psi.size(); i++) {
            if (psi.get(i).getIme().equalsIgnoreCase(trazeni)) {
                Dog adoptiran = psi.remove(i);
                System.out.println("Pas " + adoptiran.getIme() + " je uspjesno adoptiran.");
                return;
            }

        }

        System.out.println("Pas sa imenom " + trazeni + " nije pronadjen.");

    }


    // Meni
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int izbor;

        // Do while petlja
        do {
        System.out.println("------ Upravljanje azilom za pse ------");
        System.out.println("1. Dodaj psa");
        System.out.println("2. Ispisi sve pse");
        System.out.println("3. Pretrazi psa po imenu");
        System.out.println("4. Azuriraj psa");
        System.out.println("5. Adoptiranje psa");
        System.out.println("0. Izlaz");
        System.out.print("Birate opciju: ");
        izbor = sc.nextInt();
        sc.nextLine();

        // Switch case
        switch (izbor) {
            case 1:
                System.out.println("Izabrali ste opciju unosa psa.");
                Dog noviPas = Main.unesiPsa(sc);
                psi.add(noviPas);
                break;
            case 2:
                ispisiPse();
                break;
            case 3:
                pretraziPsa(sc);
                break;
            case 4:
                azuriranjePsa(sc);
                break;
            case 5:
                adoptiranjePsa(sc);
                break;
            case 0:
                System.out.println("Izašli ste iz programa.");
                break;
            default:
                System.out.println("Pogrešan izbor.");


        }

        }while(izbor != 0);
        sc.close(); //Zatvaranje skenera
    }

}
