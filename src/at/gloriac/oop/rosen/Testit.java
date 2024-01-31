package at.gloriac.oop.rosen;

import java.util.ArrayList;
import java.util.Random;

public class Testit {

        public static void main(String[] args) {
            Random r=new Random();
            Rose rose = new Rose();
            Vase vase = new Vase(20, "Rosenvase:)", 30, 2.5);
            System.out.println(" "+vase.getName_Vase());
            System.out.println(vase.getRoseninVase());
            vase.setVasenplaetze(20);
            vase.setGroeße(340);
            vase.setPreis(4);
            System.out.println(vase.getRoseninVase());

            Rose rose2 = new Rose(340, "blau", 4, 30 );
            System.out.println(rose2.getInfoAuto());

            ArrayList<Rose> roseArrayList = new ArrayList<>(); // mit alt+Enter wir wird es oben angefügt
            String[] aFarben={"blau", "rot", "gelb", "weiß", "pink", "türkis"};

            for(var i=1; i<=100; i++){
                int ps=r.nextInt((10+1-11)+10);
                int ra=r.nextInt(4+1-3)+3;
                int fa= r.nextInt(aFarben.length-1); //Zugriff mit index start bei 0!!
                int hoehe = r.nextInt(20+1-11)+11;
                roseArrayList.add(new Rose(ps,aFarben[fa],ra,hoehe));

            }
            for(Rose a: roseArrayList){
                System.out.println(a.getInfoAuto());
                vase.addRosenGarage(a);
                System.out.println(vase.getVasenplaetze()+ " Plätze zu vergeben - frei Plätze "+vase.getFreiePlaetze());
            }

            vase.getRoseDauer(3,14);
            vase.loescheRosefarbe("weiß");
        }

    }

