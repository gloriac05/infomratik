package at.gloriac.basis;

import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {
        System.out.println("Den Text eingeben, der ver- und entschlüsselt werden soll:");

        String input = new Scanner(System.in).nextLine();
        String encrypted = encrypt(input);

        System.out.println("Verschlüsselt: " + encrypted);
    }

    public static String rotate(String string, int menge) {  // Eingabestring in Kleinbuchstaben umwandeln und in ein char Array schreiben

        char[] temp = string.toLowerCase().toCharArray();

        // Alle Buchstaben im char Array durchgehen
        for (int i = 0; i < temp.length; i++) {        // Zeichen nur umwandeln, wenn es Buchstaben sind!

            if (temp[i] >= 'a' && temp[i] <= 'z') {    // Buchstaben um die gewünschte Anzahl verändern
                temp[i] += menge;


                if (temp[i] < 'a') {            // Falls Alphabeth zu Ende ist, wird wieder am Anfang begonnen
                    temp[i] += 26;
                } else if (temp[i] > 'z') {
                    temp[i] -= 26;
                }
            }
        }

        return new String(temp);  // char Array wieder in einen String umwandeln und zurückgeben
    }

    public static String encrypt(String string) {

        return rotate(string, 2);
    }


}
