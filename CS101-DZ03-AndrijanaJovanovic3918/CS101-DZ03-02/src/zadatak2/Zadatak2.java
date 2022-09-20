/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        double cena;
        int opcija;
        double cenaUvecana;
        double cenaUmanjena;

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cenu: ");
        cena = sc.nextDouble();
        System.out.println("Unesite opciju 1(za regularnu cenu) ili opciju 2(za akciju): ");
        opcija = sc.nextInt();

        if (opcija == 1) {
            cenaUvecana = cena + (cena * 0.2);
            System.out.println("Regularna cena je: " + cenaUvecana);

        } else if (opcija == 2) {
            cenaUmanjena = cena - (cena * 0.05);
            System.out.println("Cena za akciju je: " + cenaUmanjena);

        } else {
            System.out.println("Greska");
        }
    }

}
