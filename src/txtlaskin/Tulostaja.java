package txtlaskin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tulostaja {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void Kaynnista() {
        try {
            System.out.println("Tervetuloa tekstipohjaiseen laskimeen. v.1.0");

            while (true) {
                System.out.println("\n1: Yhteenlasku\n"
                        + "2: Vähennyslasku\n"
                        + "3: Kertolasku\n"
                        + "4: Jakolasku\n\n"
                        + "5: Poistu\n\n"
                        + "Anna komento:");

                int luettu = Integer.parseInt(in.readLine());
                System.out.println("");

                if (luettu == 5) {
                    System.out.println("Ohjelma suljetaan...");
                    break;
                }

                // Yhteenlasku
                if (luettu == 1) {
                    System.out.println("Anna ensimmäinen kokonaisluku: ");
                    int luku1 = Integer.parseInt(in.readLine());
                    System.out.println("Anna toinen kokonaisluku: ");
                    int luku2 = Integer.parseInt(in.readLine());

                    System.out.println(luku1 + " + " + luku2 + " = " + Laskin.summa(luku1, luku2));
                }

                // Vähennyslasku
                if (luettu == 2) {
                    System.out.println("Anna ensimmäinen kokonaisluku: ");
                    int luku1 = Integer.parseInt(in.readLine());
                    System.out.println("Anna toinen kokonaisluku: ");
                    int luku2 = Integer.parseInt(in.readLine());

                    System.out.println(luku1 + " - " + luku2 + " = " + Laskin.vahennys(luku1, luku2));
                }

                // Kertolasku
                if (luettu == 3) {
                    System.out.println("Anna ensimmäinen kokonaisluku: ");
                    int luku1 = Integer.parseInt(in.readLine());
                    System.out.println("Anna toinen kokonaisluku: ");
                    int luku2 = Integer.parseInt(in.readLine());

                    System.out.println(luku1 + " * " + luku2 + " = " + Laskin.kerto(luku1, luku2));
                }

                // Jakolasku
                if (luettu == 4) {
                    System.out.println("Anna ensimmäinen kokonaisluku: ");
                    int luku1 = Integer.parseInt(in.readLine());
                    System.out.println("Anna toinen kokonaisluku: ");
                    int luku2 = Integer.parseInt(in.readLine());

                    System.out.println(luku1 + " / " + luku2 + " = " + Laskin.jako(luku1, luku2));
                }

            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Virhe syöttö...");
        }
    }

}
