/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Zadatak18 {

    static Scanner sc = new Scanner(System.in);

    public static void odredjivanjeElemenata(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesite " + (i + 1) + ". elemenat niza: ");
            System.out.print("niz [" + i + "]= ");
            niz[i] = sc.nextInt();
        }
    }

    public static void stampajNiz(int[] niz) {
        System.out.println(Arrays.toString(niz));
    }

    public static int duzinaRazlikeSkupova(int[] nizA, int[] nizB) {
        int duzinaRazlike = 0;
        boolean provera = false;

        for (int i = 0; i < nizA.length; i++) {
            for (int j = 0; j < nizB.length; j++) {
                if (nizA[i] == nizB[j]) {
                    provera = true;
                }
            }
            if (provera == false) {
                ++duzinaRazlike;
            }
            provera = false;
        }

        for (int i = 0; i < nizB.length; i++) {
            for (int j = 0; j < nizA.length; j++) {
                if (nizB[i] == nizA[j]) {
                    provera = true;
                }
            }
            if (provera == false) {
                duzinaRazlike++;
            }
            provera = false;
        }
        return duzinaRazlike;
    }

    public static int[] razlikaSkupova(int[] nizA, int[] nizB) {
        int[] razlikaSkupova = new int[duzinaRazlikeSkupova(nizA, nizB)];
        boolean provera = false;
        int brojac = 0;

        for (int i = 0; i < nizA.length; i++) {
            for (int j = 0; j < nizB.length; j++) {
                if (nizA[i] == nizB[j]) {
                    provera = true;
                }
            }
            if (provera == false) {
                razlikaSkupova[brojac] = nizA[i];
                brojac++;
            }
            provera = false;
        }

        for (int i = 0; i < nizB.length; i++) {
            for (int j = 0; j < nizA.length; j++) {
                if (nizB[i] == nizA[j]) {
                    provera = true;
                }
            }
            if (provera == false) {
                razlikaSkupova[brojac] = nizB[i];
                brojac++;
            }
            provera = false;
        }
        return razlikaSkupova;
    }

    public static void main(String[] args) {
        System.out.print("Unesite duzinu niza A: ");
        int duzinaA = sc.nextInt();
        int[] nizA = new int[duzinaA];
        odredjivanjeElemenata(nizA);

        System.out.println("");

        System.out.print("Unesite duzinu niza B: ");
        int duzinaB = sc.nextInt();
        int[] nizB = new int[duzinaB];
        odredjivanjeElemenata(nizB);

        System.out.println();

        System.out.print("NizA: ");
        stampajNiz(nizA);
        System.out.print("NizB: ");
        stampajNiz(nizB);

        int[] razlikaSkupova = razlikaSkupova(nizA, nizB);
        System.out.println("Razlika skupova je skup : " + Arrays.toString(razlikaSkupova));

    }
 
}
