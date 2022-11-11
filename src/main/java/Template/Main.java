package Template;

import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        String axis = null;
        String engine = "", body = "", Prod = "";
        String color = null;

        Scanner scanner = new Scanner (System.in);

        System.out.print ("Axl: ");
        axis = scanner.next ();

        System.out.print ("Engine: ");
        engine = scanner.next ();

        System.out.print ("Body: ");
        body = scanner.next ();

        System.out.print ("Producer: ");
        Prod = scanner.next ();

        String answer = "";
        System.out.print ("Add color of body?If yes -> tap 1, else -> Key 0: ");
        answer = scanner.next ();
        if (answer.equals ("1"))
        {
            System.out.print ("Color:");
            color = scanner.next ();
        }

        var creator = new Consumer (axis, engine, body, Prod, color);
        creator.create ();
    }
}
