/*
 Zadatak 18:
Kreirati projekat koji de se zvati CS101-DZ02-18. U okviru projekta treba da 
postoji paket zadatak18 i pokretačka klasa Zadatak18. U okviru ovog programa 
korisnik unosi svoju dnevnicu u dinarima preko konzole. Program treba da mu 
izračuna kolika su mu mesečna primanja ukoliko mesec ima 20.
 */
package zadatak18;

import java.util.Scanner;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Zadatak18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dnevnicaVrednost;
        double mesecnaPrimanja;
        final int DANA;
        DANA = 20;

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vrednost dnevnice u dinarima: ");
        dnevnicaVrednost = sc.nextDouble();

        mesecnaPrimanja = dnevnicaVrednost * DANA;
        System.out.println("Mesecna primanja za " + DANA + " dana u dinarima su: " + mesecnaPrimanja);

    }

}
