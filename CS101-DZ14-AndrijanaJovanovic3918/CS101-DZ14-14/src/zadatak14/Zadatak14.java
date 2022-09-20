package zadatak14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak14 {

    public static void main(String[] args) {
        File ulaz = null;
        File izlaz = null;
        PrintWriter pwUlaz = null;
        PrintWriter pwIzlaz = null;
        
        try {
            ulaz = new File("ulaz.txt");
            ulaz.createNewFile();
            izlaz = new File("izlaz.txt");
            izlaz.createNewFile();         
            pwUlaz = new PrintWriter("ulaz.txt");
            pwIzlaz = new PrintWriter("izlaz.txt");
        } catch (IOException ex) {
            System.out.println("IO Exception!");
        }
        
        Scanner ulazSaTastature = null;
        int brojLinija = -1;
        try {
            ulazSaTastature = new Scanner(System.in);
            System.out.print("Koliko linija zelite da upisete u fajl: ");
            brojLinija = ulazSaTastature.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Input Mismatch Exception!");
        }
        
        for (int i = 0; i < brojLinija; i++) {
            System.out.print("Unesite " + (i + 1) + ". liniju: ");
            pwUlaz.println(ulazSaTastature.next());
        }        
        pwUlaz.close();
        ulazSaTastature.close();
        
        Scanner ulazIzFajla = null;
        try {
            ulazIzFajla = new Scanner(ulaz);
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found Exception!");
        }
        
        while (ulazIzFajla.hasNext()) {
            String rec = ulazIzFajla.next();
            if (proveriPalindrom(rec)) {
                pwIzlaz.println(rec);
            }
        }
        pwIzlaz.close();
        ulazIzFajla.close();
        
    }
    
    public static boolean proveriPalindrom(String rec) {
        int pocetak = 0, kraj = rec.length() - 1;
        boolean palindrom = true;
        
        for (int i = 0; i < rec.length() / 2; i++){
            if (rec.charAt(pocetak) != rec.charAt(kraj)) {
                palindrom = false;
                break;
            }
        }
                
        return palindrom;
    }
}
