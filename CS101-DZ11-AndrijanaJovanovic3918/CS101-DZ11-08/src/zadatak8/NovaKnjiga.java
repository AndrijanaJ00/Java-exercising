package zadatak8;

public class NovaKnjiga extends Knjiga implements Izracunljiv{

    public NovaKnjiga() {
        
    }

    public NovaKnjiga(String naziv, String sifra, double osnovnaCena) {
        super(naziv, sifra, osnovnaCena);
    }
    
    public NovaKnjiga(NovaKnjiga temp) {
        super(temp);
    }

    @Override
    public double racunajCenu() {
        return getOsnovnaCena() * 1.2;
    }

   @Override
   public String toString() {
       return super.toString() + ", Cena " + racunajCenu();
   }
    
}
