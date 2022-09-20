package zadatak8;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Zadatak8 {

    public static void main(String[] args) {

        Fakultet fakultet = new Fakultet();
        fakultet.setNaziv("Metropolitan");
        fakultet.setTekucaGod("2019/2020");
        System.out.println(fakultet.toString());
        
        System.out.println("----------------------");

        Student student1 = new Student("Marko", "Markovic", 4323, "11.02.1999", "2019/2020", "2018/2019");
        fakultet.dodajStudenta(student1);
        System.out.println(student1.toString());

        System.out.println("Brucos: " + student1.isBrucos(fakultet.getTekucaGod()));

        //dodaju se ocene
        student1.dodajOcenu(8);
        student1.dodajOcenu(10);
        student1.dodajOcenu(9);
        student1.dodajOcenu(7);
        student1.dodajOcenu(7);
        student1.dodajOcenu(9);

        System.out.println("PROSEK: " + student1.prosek());

        /*
        //broji koliko ima ocena u listi
        System.out.println(student1.getListaOcena().size());
         */
        
        //gleda se koje sve ocene ima
        System.out.print("Ocene: ");
        System.out.println(student1.getListaOcena().toString());
        System.out.println("----------------------");

        Student student2 = new Student("Jelena", "Nikolic", 3992, "20.04.2000", "2019/2020", "2019/2020");
        fakultet.dodajStudenta(student2);
        System.out.println(student2.toString());

        System.out.println("Brucos: " + student2.isBrucos(fakultet.getTekucaGod()));

        student2.dodajOcenu(8);
        student2.dodajOcenu(8);
        student2.dodajOcenu(6);
        student2.dodajOcenu(7);
        student2.dodajOcenu(7);

        System.out.println("PROSEK: " + student2.prosek());

        //gleda se koje sve ocene ima
        System.out.print("Ocene:");
        System.out.println(student2.getListaOcena().toString());
        System.out.println("----------------------");
        
        System.out.println("Na fakultetu ima: " + fakultet.getListaStudenata().size() + " studenta.");
        System.out.println(fakultet.getListaStudenata().toString());

    }

}
