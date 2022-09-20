/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

import java.util.Scanner;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Zadatak1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite jedan ceo broj ");
        System.out.print("n = ");
        int n = sc.nextInt();
        long faktorijel = 1;

        for (int i = 1; i <= n; i++) {
            faktorijel *= i;
        }
        System.out.println("Faktorijel je: " + faktorijel);
        sc.close();
    }
}
