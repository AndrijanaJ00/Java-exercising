package zadatak8;

public class Zadatak8 {

    public static void main(String[] args) {
        NovaKnjiga n1 = new NovaKnjiga("Mali Princ", "1234", 500);
        System.out.println("Cena knjige " + n1.getNaziv() + " je " + n1.racunajCenu() + " dinara.");

        AntikvarnaKnjiga a1 = new AntikvarnaKnjiga("Gradovi na papiru", "3241", 700);
        System.out.println("Cena knjige " + a1.getNaziv() + " je " + a1.racunajCenu() + " dinara.");
        
        PolovnaKnjiga p1 = new PolovnaKnjiga("Romeo i Julija", "2314", 300);
        System.out.println("Cena knjige " + p1.getNaziv() + " je " + p1.racunajCenu() + " dinara.");
        
        Knjiga[] knjige = {n1, a1, p1};
        
        double ukupnaCena = 0;
        
        for (int i = 0; i < knjige.length; i++) {
            if (knjige[i] instanceof NovaKnjiga) {
               ukupnaCena += knjige[i].getOsnovnaCena() * 1.2;
           }
           if (knjige[i] instanceof PolovnaKnjiga) {
               ukupnaCena += knjige[i].getOsnovnaCena() * 0.8;
           }
           if (knjige[i] instanceof AntikvarnaKnjiga) {
               ukupnaCena += knjige[i].getOsnovnaCena() * 3;
           }
        }
        System.out.println("Ukupna cena je: " + ukupnaCena + "din.");
        System.out.println("Prosecna cena je: " + ( ukupnaCena / knjige.length ) + "din.");
    }

}
