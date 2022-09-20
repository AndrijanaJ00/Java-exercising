/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak8;

import exception.InvalidOperatorException;
import exception.NoOperandException;
import java.util.InputMismatchException;
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
        try {
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
                if (opcije < 1 || opcije > 4) {
                    throw new InvalidOperatorException();
                }
                switch (opcije) {
                    case 1:
                        System.out.println(k1.sabiranje());
                        System.out.println();
                        break;
                    case 2:
                        System.out.println(k1.oduzimanje());
                        System.out.println();
                        break;
                    case 3:
                        System.out.println(k1.mnozenje());
                        System.out.println();
                        break;
                    case 4:
                        System.out.println(k1.deljenje());
                        System.out.println();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Pogresan unos!!!");
                }
            } while (opcije != 5);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (InvalidOperatorException ex) {
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Unesite cifru!");
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
