package zadatak8;

public class HRSektor extends Sektor {

    public HRSektor() {

    }

    public HRSektor(String naziv, int brojZaposlenih) {
        super(naziv, brojZaposlenih);
    }

    public HRSektor(HRSektor temp) {
        super(temp);
    }

    @Override
    public double racunajPlatu() {
        return (1000000 / super.getBrojZaposlenih()) * 0.8;
    }

    @Override
    public String toString() {
        return "Naziv HR sektora: " + super.getNaziv() + "\nBroj zaposlenih: " + super.getBrojZaposlenih() + "\nPlata: " + racunajPlatu() + "\n";
    }
}
