/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Kupovina {

    private List<Proizvod> listaProizvoda = new ArrayList<>();
    private double sum;

    public Kupovina() {
    }

    public Kupovina(List<Proizvod> listaProizvoda, double sum) {
        this.listaProizvoda = listaProizvoda;
        this.sum = sum;

    }

    public List<Proizvod> getListaProizvoda() {
        return listaProizvoda;
    }

    public void setListaProizvoda(List<Proizvod> listaProizvoda) {
        this.listaProizvoda = listaProizvoda;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;

    }

    public void dodajUKorpu(Proizvod p) {
        this.listaProizvoda.add(p);
    }

    public double cenaIzKorpe() {
        this.sum = 0;
        for (int i = 0; i < this.listaProizvoda.size(); i++) {
            sum += this.listaProizvoda.get(i).getCena();
        }
        return this.sum;
    }

    public Proizvod najskupljiProizvod() {
        Proizvod max = this.listaProizvoda.get(0);
        for (int i = 0; i < this.listaProizvoda.size(); i++) {
            if (this.listaProizvoda.get(i).getCena() > max.getCena()) {
                max = this.listaProizvoda.get(i);
            }
        }
        return max;
    }

    /*public boolean imaNema(double trazenaCena) {

        for (int i = 0; i < this.listaProizvoda.size(); i++) {
            if (this.listaProizvoda.get(i).getCena() == trazenaCena) {
                return true;

            }
        }
        return false;

    }*/
    @Override
    public String toString() {
        return "Kupovina{" + "listaProizvoda=" + listaProizvoda + ", sum=" + sum + '}';
    }
}
