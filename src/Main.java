import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        niz znakova - String
        String fakultet = "Fakultet organizacije i informatike Varaždin";
        String[] rijecFakultet = fakultet.split(" ");
        for (String s : rijecFakultet) {
            System.out.println(s);
        }

        List<String> niz= new ArrayList<>();
        niz.add("Nizi");


        String recenica = "   Danas je bio hladan dan   ";
        System.out.println("Unos ima " + recenica.length() + " znakova.");
        recenica = recenica.trim();
        System.out.println("Broj znakova nakon skracivanja je: " + recenica.length());


    }
}