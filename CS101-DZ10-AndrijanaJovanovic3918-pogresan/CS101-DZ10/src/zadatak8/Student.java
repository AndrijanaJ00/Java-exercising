package zadatak8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Student {

    private String ime;
    private String prezime;
    private int ideks;
    private String datumRodjenja;
    private String poslednjaGodUpisa;
    private String godinaUpisa;
    private List<Integer> listaOcena = new ArrayList<>();

    public Student() {
    }

    public Student(String ime, String prezime, int ideks, String datumRodjenja, String poslednjaGodUpisa, String godinaUpisa) {
        this.ime = ime;
        this.prezime = prezime;
        this.ideks = ideks;
        this.datumRodjenja = datumRodjenja;
        this.poslednjaGodUpisa = poslednjaGodUpisa;
        this.godinaUpisa = godinaUpisa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getIdeks() {
        return ideks;
    }

    public void setIdeks(int ideks) {
        this.ideks = ideks;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getPoslednjaGodUpisa() {
        return poslednjaGodUpisa;
    }

    public void setPoslednjaGodUpisa(String poslednjaGodUpisa) {
        this.poslednjaGodUpisa = poslednjaGodUpisa;
    }

    public String getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(String godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public List<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(List<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public boolean isBrucos(String tekucaGodina) {
        boolean isBrucos = false;
        if (this.godinaUpisa.equalsIgnoreCase(tekucaGodina)) {
            isBrucos = true;
        }
        return isBrucos;

    }

    public double prosek() {
        double sum = 0;
        for (int i = 0; i < this.listaOcena.size(); i++) {
            sum += this.listaOcena.get(i);
        }
        double prosek = sum / this.listaOcena.size();
        prosek = Math.round(prosek * 100.0) / 100.0;
        return prosek;
    }

    public void dodajOcenu(int ocena) {
        if (ocena > 5 && this.listaOcena.size() < 32 && ocena <= 10) {
            this.listaOcena.add(ocena);
        }
    }

    @Override
    public String toString() {
        return "Student " + ime + " " + prezime + ", broj ideksa: " + ideks;
    }

}
