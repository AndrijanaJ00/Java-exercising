package zadatak8;

public class ITSektor extends Sektor {

    public ITSektor() {

    }

    public ITSektor(String naziv, int brojZaposlenih) {
        super(naziv, brojZaposlenih);
    }

    public ITSektor(ITSektor temp) {
        super(temp);
    }

    @Override
    public double racunajPlatu() {
        return (1000000 / super.getBrojZaposlenih()) * 0.8 + 5000;
    }

    @Override
    public String toString() {
        return "Naziv IT sektora: " + super.getNaziv() + "\nBroj zaposlenih: " + super.getBrojZaposlenih() + "\nPlata: " + racunajPlatu() + "\n";
    }

}
