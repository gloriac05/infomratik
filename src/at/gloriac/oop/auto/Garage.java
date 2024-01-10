package at.gloriac.oop.auto;

import java.util.ArrayList;

public class Garage {
    private int stellplaetze;
    private String adresse;

    public Garage(int stellplaetze, String addresse, int einfahrtshoehe, double preisstunde) {
        this.stellplaetze = stellplaetze;
        this.adresse = addresse;
        this.einfahrtshoehe = einfahrtshoehe;
        this.preisstunde = preisstunde;
        this.autoListe = new ArrayList<Auto>();
    }

    private int einfahrtshoehe;
    private double preisstunde;

    public int getStellplaetze() {
        return stellplaetze;
    }

    public void setStellplaetze(int stellplaetze) {
        this.stellplaetze = stellplaetze;
    }

    public String getAddresse() {
        return adresse;
    }

    public void setAddresse(String addresse) {
        this.adresse = addresse;
    }

    public int getEinfahrtshoehe() {
        return einfahrtshoehe;
    }

    public void setEinfahrtshoehe(int einfahrtshoehe) {
        this.einfahrtshoehe = einfahrtshoehe;
    }

    public double getPreisstunde() {
        return preisstunde;
    }

    public void setPreisstunde(float preisstunde) {
        this.preisstunde = preisstunde;
    }

    private ArrayList<Auto> autoListe;

    public int getAutosinGarage() {
        return this.autoListe.size();
    }
    public int getFreiePlaetze(){
        return this.stellplaetze - getAutosinGarage();
    }

    public void addAutoGarage(Auto auto){
        //Abfrage ist auto höher als garage hoehe
        if(auto.getFahrzeughoehe()>einfahrtshoehe){
            System.out.println("Hoi, hast a hohes Auto, leider nid in dera Garage!!! Maxhöhe in der Garage "+this.getEinfahrtshoehe());
        } else if(this.getFreiePlaetze()>0) {
            this.autoListe.add(auto);
        } else{
            System.out.println("Ups, Garage keinen Platz mehr frei, versuche es später noch einmal!!");
        }
    }

    public int getGesamtfahrzeugeUebereinander(){
        int wert =0;

        return wert;
    }
}
