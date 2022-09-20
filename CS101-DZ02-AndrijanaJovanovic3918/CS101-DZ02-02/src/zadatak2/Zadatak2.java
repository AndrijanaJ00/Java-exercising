/*
 Zadatak 2:
Kreirati projekat koji de se zvati CS101-DZ02-02. U okviru projekta treba da 
postoji paket zadatak2 i pokretačka klasa Zadatak2. Napisati program koji nalazi
i na standardnom izlazu štampa aritmetičku sredinu od tri uneta broja. 
 */
package zadatak2;

import java.util.Scanner;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Zadatak2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c;
        double as;

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        a = sc.nextDouble();

        System.out.println("Unesite drugi broj: ");
        b = sc.nextDouble();

        System.out.println("Unesite treci broj: ");
        c = sc.nextDouble();

        as = (a + b + c) / 3.0;

        System.out.println("Aritmeticka sredina od 3 uneta broja je: " + as);
    }

}
