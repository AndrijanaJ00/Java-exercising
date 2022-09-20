package zadatak8;

public class PolovnaKnjiga extends Knjiga implements Izracunljiv{

    public PolovnaKnjiga() {
        
    }

    public PolovnaKnjiga(String naziv, String sifra, double osnovnaCena) {
        super(naziv, sifra, osnovnaCena);
    }
    
    public PolovnaKnjiga(PolovnaKnjiga temp) {
        super(temp);
    }

    @Override
    public double racunajCenu() {
        return getOsnovnaCena() * 0.8;       
    }
   
    @Override
    public String toString() {
        return super.toString() + ", Cena " + racunajCenu();
    }
}
