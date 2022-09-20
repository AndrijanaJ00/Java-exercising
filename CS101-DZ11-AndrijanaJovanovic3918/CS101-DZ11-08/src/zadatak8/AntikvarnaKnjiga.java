package zadatak8;

public class AntikvarnaKnjiga extends Knjiga implements Izracunljiv{

    public AntikvarnaKnjiga() {
        
    }

    public AntikvarnaKnjiga(String naziv, String sifra, double osnovnaCena) {
        super(naziv, sifra, osnovnaCena);
    }

    public AntikvarnaKnjiga(AntikvarnaKnjiga temp) {
        super(temp);
    }
    
    @Override
    public double racunajCenu() {
        return super.getOsnovnaCena() * 3;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Cena " + racunajCenu();
    }
}
