package zadatak8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Fakultet {

    private String naziv;
    private String tekucaGod;
    private List<Student> listaStudenata = new ArrayList<>();

    public Fakultet() {
    }

    public Fakultet(String naziv, String tekucaGod) {
        this.naziv = naziv;
        this.tekucaGod = tekucaGod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTekucaGod() {
        return tekucaGod;
    }

    public void setTekucaGod(String tekucaGod) {
        this.tekucaGod = tekucaGod;
    }

    public List<Student> getListaStudenata() {
        return listaStudenata;
    }

    public void setListaStudenata(List<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    public void dodajStudenta(Student student) {
        this.listaStudenata.add(student);
    }
    public void stampajStudente(Student s){
        System.out.println();
    }
    @Override
    public String toString() {
        return "Fakultet " + naziv + ", tekuca godina: " + tekucaGod;
    }

}
