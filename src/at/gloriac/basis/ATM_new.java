package at.gloriac.basis;
import java.util.Random;
import java.util.Scanner;

public class ATM_new {
    public static void main(String[] args) {
        {
            int balance = 100000, withdraw, deposit;

            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("Selektiren Sie die gewünschte Funktion");
                System.out.println("1. Abheben");
                System.out.println("2. Einzahlen");
                System.out.println("3. Kontostand anzeigen");
                System.out.print("4. Schließen");


                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Geld eingeben, dass ausgezalt werden soll:");

                        withdraw = sc.nextInt();


                        if (balance >= withdraw) {

                            balance = balance - withdraw;
                            System.out.println("Ihr Kontostand beträgt:"+balance);
                        } else {

                            System.out.println("Falsche Eingabe");
                        }
                        System.out.println("");
                        break;

                    case 2:

                        System.out.print("Geld eingeben, dass ausgezalt werden soll:");

                        deposit = sc.nextInt();


                        balance = balance + deposit;
                        System.out.println("Ihr Geld wurde erfolgreich eingezahlt!");
                        System.out.println("");
                        break;

                    case 3:
                        //displaying the total balance of the user
                        System.out.println("Kontostand : " + balance);
                        System.out.println("");
                        break;

                    case 4:
                        //exit from the menu
                        System.exit(0);
                }
            }
        }
    }
}