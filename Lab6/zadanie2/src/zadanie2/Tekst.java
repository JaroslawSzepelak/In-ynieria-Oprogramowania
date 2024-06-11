package zadanie2;

import java.util.Arrays;

public class Tekst {
    private String[] tekst;

    public Tekst(String[] tekst) {
        this.tekst = tekst;
    }

    public void sortuj() {
        Arrays.sort(tekst);
    }

    public void wypisz() {
        for (String s : tekst) {
            System.out.println(s);
        }
    }

    public String[] getTekst() {
        return tekst;
    }
}