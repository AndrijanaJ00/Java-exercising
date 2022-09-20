package zadatak8;

public abstract class Sektor {

    private String naziv;
    private int brojZaposlenih;
    private static double plataZaposlenih;

    public Sektor() {

    }

    public Sektor(String naziv, int brojZaposlenih) {
        this.naziv = naziv;
        this.brojZaposlenih = brojZaposlenih;
    }

    public Sektor(Sektor temp) {
        this.naziv = temp.naziv;
        this.brojZaposlenih = temp.brojZaposlenih;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojZaposlenih() {
        return this.brojZaposlenih;
    }

    public void setBrojZaposlenih(int brojZaposlenih) {
        this.brojZaposlenih = brojZaposlenih;
    }

    public abstract double racunajPlatu();

}
