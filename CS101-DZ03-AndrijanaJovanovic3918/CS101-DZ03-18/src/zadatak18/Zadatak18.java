/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        a = sc.nextDouble();
        System.out.println("Unesite drugi broj: ");
        b = sc.nextDouble();
        System.out.println("Unesite treci broj: ");
        c = sc.nextDouble();

        if (a > b && a > c) {
            System.out.println("Max je: " + a);
        } else if (b > a && b > c) {
            System.out.println("Max je: " + b);
        } else {
            System.out.println("Max je: " + c);
        }
    }

}
