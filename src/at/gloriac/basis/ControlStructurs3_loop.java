package at.gloriac.basis;

import java.util.Random;
//Zähle die Zahlen zwischen 0 und inkusive 100 inklusive auf
public class ControlStructurs3_loop {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        for (int i = 0; i < 101; i++) {
            System.out.println("Hallo" +i);

        }
    }
}