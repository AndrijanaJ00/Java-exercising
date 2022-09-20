/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Zadatak8 {

     static Random r = new Random();

    public static void ucitajMatricu(int[][] matrica) {
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                matrica[i][j] = r.nextInt(10) + 20;
            }
        }

    }

    public static void stampajMatricu(int[][] matrica) {
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int sumaNaGlavnojDijagonali(int[][] matrica) {
        int suma = 0;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                if (i == j) {
                    suma += (matrica[i][j] * 5);
                }
            }

        }
        return suma;
    }
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

        System.out.println("Unesite  velicinu kvadratne matrice: ");
        System.out.print("n= ");
        int n = sc.nextInt();

        int[][] matrica = new int[n][n];

        ucitajMatricu(matrica);
        stampajMatricu(matrica);
        System.out.println();
        System.out.println("Suma na glavnoj dijagonali pomnozena sa 5: " + sumaNaGlavnojDijagonali(matrica));

    }
 }
    

