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
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite jedan broj: ");
        System.out.print("broj = ");
        double broj = sc.nextDouble();

        System.out.println("Unesite exponent: ");
        System.out.print("exponent = ");
        int exponent = sc.nextInt();

        double stepenBroja = 1;
        for (int i = 0; i < exponent; i++) {
            stepenBroja *= broj;
        }
        System.out.println(exponent + ". stepen broja " + broj + " je " + stepenBroja);
        sc.close();
    }

}
