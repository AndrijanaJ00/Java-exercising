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
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu: ");
        int godina = sc.nextInt();

        prestupna(godina);
        sc.close();
    }

    public static int prestupna(int godina) {
        if ((godina % 4 == 0 && godina % 100 != 0) || godina % 1000 == 0) {
            System.out.println(godina + ". godina je prestupna");

        } else {
            System.out.println(godina + ". godina nije prestupna");
        }
        return godina;
    }
}
