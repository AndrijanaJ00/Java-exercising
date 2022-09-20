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
public class Proizvod {

    private String ime;
    private double cena;

    public Proizvod() {
    }

    public Proizvod(String ime, double cena) {
        this.ime = ime;
        this.cena = cena;
    }

    public Proizvod(Proizvod p) {
        this.ime = p.ime;
        this.cena = p.cena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Proizvod{" + "ime=" + ime + ", cena=" + cena + '}';
    }

}
