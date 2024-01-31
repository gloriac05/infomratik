package at.gloriac.oop.rosen;

public class Rose {

        private int iArt;
        private String sFarbe;
        private int iDornen;

        private int groeße;

        public Rose() {
            this.iArt=0;
            this.sFarbe="weiß";
            this.iDornen=0;
            this.groeße = 0;
        }

        public Rose(int iArt, String sFarbe, int iDornen, int groeße) {
            this.iArt = iArt;
            this.sFarbe = sFarbe;
            this.iDornen = iDornen;
            this.groeße = groeße;
        }

        public int getGröße() {
            return groeße;
        }

        public void setGröße(int fahrzeughoehe) {
            this.groeße = fahrzeughoehe;
        }

        public int getiDornen () {
            return iDornen;
        }

        public void setiDornen(int iDornen) {
            this.iDornen = iDornen;
        }

        public int getiArt() {
            return iArt;
        }

        public void setiArt(int iArt) {
            this.iArt = iArt;
        }

        public String getsFarbe() {
            return sFarbe;
        }

        public void setsFarbe(String sFarbe) {
            this.sFarbe = sFarbe;
        }

        public String getInfoAuto(){
            return "Rosen Farbe ist " + this.getsFarbe()+
                    " mit der Art " + this.getiArt()+
              " Anzahl Dornen "+ this.getiDornen()+
                    " Größe " + this.getGröße();


        }
    }

