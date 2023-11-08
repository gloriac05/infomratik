package at.gloriac.basis;
import java.util.Random;

public class ControlStructures3_while {

    public static void main(String[] args) {

        Random random = new Random();
        boolean isFinished = false;

        while (!isFinished) {

            int low = 10;
            int high = 30;
            int result = random.nextInt(high-low) + low;

            System.out.println("Nr:" + result);
            if (result == 15) {
                isFinished = true;
            }
            else if (result == 25) {
                isFinished = true;
            }
        } System.out.println("Finished");

    }

}

