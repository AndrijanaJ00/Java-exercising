/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak8;

import java.util.Scanner;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Zadatak8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        Kalkulator k1 = new Kalkulator();
        System.out.print("Unesite prvi broj: ");
        k1.setA(sc.nextDouble());
        System.out.print("Unesite drugi broj: ");
        k1.setB(sc.nextDouble());
         System.out.println();
        int opcije;
        do {
         System.out.println("****IZABERITE METODE****");
         prikaziOpcije();
         opcije = sc.nextInt();
        switch (opcije) {
            case 1:
                System.out.print("Sabiranje: a + b = ");
                System.out.println(k1.sabiranje());
                System.out.println();
                break;
            case 2:
                System.out.print("Oduzimanje: a - b = ");
                System.out.println(k1.oduzimanje());
                System.out.println();
                break;
            case 3:
                System.out.print("Mnozenje: a * b = ");
                System.out.println(k1.mnozenje());
                System.out.println();
                break;
            case 4:
                System.out.println("Deljenje: a / b = ");
                System.out.println();
                break;
            case 5:
                break;
            default:
                System.out.println("Pogresan unos!!!");
        }
        } while (opcije != 5);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void prikaziOpcije() {
       
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. KRAJ PROGRAMA");
        System.out.print("Unesite broj opcije: ");

    }

}
