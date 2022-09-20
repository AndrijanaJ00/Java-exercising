package zadatak8;

public abstract class Knjiga {
    private String naziv;
    private String sifra;
    private double osnovnaCena;
    
    public Knjiga() {
        
    }

    public Knjiga(String naziv, String sifra, double osnovnaCena) {
        this.naziv = naziv;
        this.sifra = sifra;
        this.osnovnaCena = osnovnaCena;
    }
    
    public Knjiga(Knjiga temp) {
        this.naziv = temp.naziv;
        this.sifra = temp.sifra;
        this.osnovnaCena = temp.osnovnaCena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double OsnovnaCena) {
        this.osnovnaCena = OsnovnaCena;
    }
    
    @Override
    public String toString() {
        return "Knjiga " + this.naziv;
    }
    
}
