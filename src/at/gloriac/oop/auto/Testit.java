package at.gloriac.oop.auto;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[] args) {
        Random r=new Random();
        Auto auto = new Auto();
        Garage garage = new Garage(67, "Lustenauerstraße 11, 6850 Dornbirn", 180, 10.0);
        System.out.println("Garage-Adresse"+garage.getAddresse());
        System.out.println(auto.getInfoAuto());
        auto.setsFarbe("blau");
        auto.setiLeistung(340);
        auto.setiAnzahlRaeder(4);
        System.out.println(auto.getInfoAuto());

        Auto auto2 = new Auto(340, "blau", 4, 180 );
        System.out.println(auto2.getInfoAuto());

        ArrayList<Auto> aAutoListe = new ArrayList<>(); // mit alt+Enter wir wird es oben angefügt
        String[] aFarben={"blau", "rot", "grün", "geld", "pink", "türkis"};

        for(var i=1; i<=100; i++){
            int ps=r.nextInt((500+1-50)+50); //max=500 min=50
            int ra=r.nextInt(4+1-3)+3; //max=4 min=3
            int fa= r.nextInt(aFarben.length-1); //Dont forget array Zugriff mit index start bei 0!!
            int hoehe = r.nextInt(200+1-110)+110;
            aAutoListe.add(new Auto(ps,aFarben[fa],ra,hoehe));

        }
        for(Auto a: aAutoListe){
            System.out.println(a.getInfoAuto());
            garage.addAutoGarage(a);
            System.out.println(garage.getStellplaetze()+ " stell - frei "+garage.getFreiePlaetze());
        }

        System.out.println("Alle Autos ergeben eine Höhe von " +garage.getGesamtfahrzeugeUebereinander());
        garage.getAutoFarbe("rot");
        garage.getAutoLeistung(30,499);
        garage.loescheAutofarbe("rot");
    }

}
