package at.gloriac.basis;
import java.util.Random;
import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {

        System.out.println("Selektiren Sie die gewünschte Funktion\n" +
                "1. Einzahlen\n" +
                "2. Abheben\n" +
                "3. Kontostand\n" +
                "4. Beenden\n");

        Scanner scanner = new Scanner(System.in);

        int selection = scanner.nextInt();
        System.out.println(selection);

        switch (selection) {
            case 1:
                System.out.println("Geben Sie den Betrag ein, den Sie einzählen möchten:");
                double case1 = scanner.nextDouble();
                System.out.println("Sie haben" + case1 + "Euro eingezahlt");
                break;
            case 2:
                System.out.println("Geben Sie den Betrag ein, den sie abheben möchten:");
                double case2 = scanner.nextDouble();
                System.out.println("Sie haben" + case2 + "Euro abgehoben");
                break;

            case 3:
                double gesamt;
                System.out.println("Der Kontostand beträgt" + gesamt + "Euro");
                break;
            case 4:
                System.out.println("Beenden");
                System.out.flush();
                break;


            default:
                System.out.println("other value");
                break;


        }
    }
}