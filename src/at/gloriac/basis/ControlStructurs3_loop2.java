package at.gloriac.basis;

import java.util.Random;

public class ControlStructurs3_loop2 {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        for (int i = 2; i < 1001; i= i+2) {
            System.out.println("Hallo" +i);
        }
    }
}
