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
