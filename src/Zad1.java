//Napišite program koji od korisnika učitava tekst u dvije varijable. U prvoj varijabli odvojeno razmakom ime i prezime,
// a u drugoj varijabli grad rođenja. Potrebno je ispisati ime i prezime, a ako je duljina imena veća od 7 znakova,
// tražiti korisnika da ponovi unos i ispisati mu poruku „Ime sadrži više od 7 znakova”.
// Razmaci prije i nakon imena i prezimena ne uzimaju se u obzir.
// Za grad rođenja potrebno je ispisati koje samoglasnike sadrži (provjera prema malim slovima).
//Primjer ispisa:
//Upišite ime i prezime:
//”     Miro Mirić  ”
//Upišite grad rođenja:
//Varaždin
//upisali ste ime: Miro
//upisali ste prezime: Mirić
//grad ima samoglasnik a
//grad ima samoglasnik i

import java.util.ArrayList;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesi ime i prezime: ");
        String imeIPrezime = scan.nextLine();
//        String za debug imeIPrezime = "    Davorrrrrrrrrrr Cepin      ";
        imeIPrezime = imeIPrezime.trim();
        String[] imePrezimeTemp = imeIPrezime.split(" ");
        String ime = imePrezimeTemp[0];
        String prezime = imePrezimeTemp[1];

        while (ime.length() > 7) {
            System.out.println("Ime je duze od 7 znakova, unesi novo! \nNovo ime: ");
            ime = scan.nextLine();
            ime = ime.trim();
        }
        System.out.println("Upisali ste ime: " + ime);
        System.out.println("Upisali ste prezime: " + prezime);
        System.out.println("Unesi grad rodenja: ");
        String gradRodenja = scan.nextLine().toLowerCase();
        gradRodenja = gradRodenja.trim();

        for (int i = 0; i < gradRodenja.length(); i++) {
            char x = gradRodenja.charAt(i);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                System.out.println("Grad ima samoglasnik " + x);
            }
        }
    }
}


