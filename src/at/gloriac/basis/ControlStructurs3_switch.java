package at.gloriac.basis;
import java.lang.invoke.SwitchPoint;
import java.util.Random;
public class ControlStructurs3_switch {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(11);

       switch (randomNumber){
             case 1:
            System.out.println("One");
            break;

            case 2:
                System.out.println("Two");
                break;
           case 3:
               System.out.println("Three");
               break;
           case 4:
               System.out.println("Four");
               break;
           case 5:
               System.out.println("Five");
               break;
           case 6:
               System.out.println("Six");
               break;
           case 7:
               System.out.println("Seven");
               break;
           case 8:
               System.out.println("Eight");
               break;
           case 9:
               System.out.println("Nine");
               break;

               case 10:
               System.out.println("Ten");
               break;

           default:
               System.out.println("other value");
               break;







    }
        // Erstelle eine Zufallszahl zwischen 5 und 10

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.
    }
}