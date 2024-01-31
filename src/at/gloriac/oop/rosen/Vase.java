package at.gloriac.oop.rosen;

import java.util.ArrayList;

public class Vase {

        private int vasenplaetze;
        private String name_Vase;

        public Vase(int vasenplaetze, String name_Vase, int groeße, double preis) {
            this.vasenplaetze = vasenplaetze;
            this.name_Vase = name_Vase;
            this.groeße = groeße;
            this.preis = preis;
            this.rosenliste = new ArrayList<Rose>();
        }

        private int groeße;
        private double preis;

        public int getVasenplaetze() {
            return vasenplaetze;
        }

        public void setVasenplaetze(int vasenplaetze) {
            this.vasenplaetze = vasenplaetze;
        }

        public String getName_Vase() {
            return name_Vase;
        }

        public void setName_Vase(String name_Vase) {
            this.name_Vase = name_Vase;
        }

        public int getGroeße() {
            return groeße;
        }

        public void setGroeße(int groeße) {
            this.groeße = groeße;
        }

        public double getPreis() {
            return preis;
        }

        public void setPreis(float preis) {
            this.preis = preis;
        }

        private ArrayList<Rose> rosenliste;

        public int getRoseninVase() {
            return this.rosenliste.size();
        }

        public int getFreiePlaetze() {
            return this.vasenplaetze - getRoseninVase();
        }

        public void addRosenGarage(Rose rose) {
            //Abfrage ist auto höher als garage hoehe
            if (rose.getGröße() > groeße) {
                System.out.println("Die Rose passt nicht in die Vase!!! Maxhöhe in der Vase " + this.getGroeße());
            } else if (this.getFreiePlaetze() > 0) {
                this.rosenliste.add(new Rose());
            } else {
                System.out.println("Oh, Vase hat keinen Platz mehr frei");
            }
        }

       public void getRosenfarbe (String farbe) {
            System.out.println("Folgende Rosen mit Farbe " + farbe + "sind in der Liste");
       }


            //Rosen mit der Dauer von, bis
            public void getRoseDauer(int lmin, int lmax) {
                int ch = 0;
                if (lmin > lmax) {
                    ch = lmax;
                    lmin = lmax;
                    lmax = ch;

                }
                System.out.println("Folgende Rosen mit der Haltbarkeit von " + lmin + " bis max " + lmax + " Tagen sind in der Liste");

            }

            public void loescheRosefarbe (String farbe){
                //aus der liste entfernen
                int counter =0;
                for(int i=rosenliste.size()-1;i>=0;i--){
                    if (rosenliste.get(i).getsFarbe().equals(farbe)) {
                        rosenliste.remove(i);
                        counter++;
                    }
                }

                System.out.println("Es wurden " + counter + " " + farbe + "Rosen gelöscht");
            }


        }

