/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Zadatak3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trafika t = new Trafika("AAA", "Nema ulice bb");

        Proizvod sok = new Proizvod("Sok", 120);
        Proizvod kokice = new Proizvod("Kokice", 100);
        Proizvod cokolada = new Proizvod("Cokolada", 350);
        Proizvod smoki = new Proizvod("Smoki", 50);
        Proizvod cips = new Proizvod("Cips", 150);

        t.dodajProizvod(sok);
        t.dodajProizvod(kokice);
        t.dodajProizvod(cokolada);
        t.dodajProizvod(smoki);
        t.dodajProizvod(cips);

        Kupovina k = new Kupovina();
        k.dodajUKorpu(cips);
        k.dodajUKorpu(cokolada);
        k.dodajUKorpu(sok);
        k.dodajUKorpu(smoki);
        k.dodajUKorpu(kokice);

        System.out.println("Prvi racun");
        System.out.println("1.Ukupna cena kupljenih proizvoda je: " + k.cenaIzKorpe() + " dinara.");
        System.out.println("Naziv najskupljeg proizvoda sa prvog racuna je: " + k.najskupljiProizvod().getIme() + "\nNjegova cena je: " + k.najskupljiProizvod().getCena() + " dinara.");
        //System.out.println(k.imaNema(350.0));

        t.dodajKupovinu(k);
        Kupovina k1 = new Kupovina();
        k1.dodajUKorpu(cips);
        k1.dodajUKorpu(kokice);
        System.out.println("******************************");
        System.out.println("Drugi racun");
        System.out.println("2.Ukupna cena kupljenih proizvoda je: " + k1.cenaIzKorpe() + " dinara.");
        System.out.println("Naziv najskupljeg proizvoda sa drugog racuna je: " + k1.najskupljiProizvod().getIme() + "\nNjegova cena je: "
                + k1.najskupljiProizvod().getCena() + " dinara.");
        //System.out.println(k1.imaNema(350.0));

        t.dodajKupovinu(k1);
        System.out.println("******************************");
        System.out.println("Stanje u kasi je: " + t.stanjeKase() + " dinara.");

    }

}
