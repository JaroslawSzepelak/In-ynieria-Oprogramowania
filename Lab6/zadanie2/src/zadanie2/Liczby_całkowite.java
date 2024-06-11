package zadanie2;

import java.util.Arrays;

public class Liczby_całkowite {
    private int[] liczby;

    public Liczby_całkowite(int[] liczby) {
        this.liczby = liczby;
    }

    public void sortuj() {
        Arrays.sort(liczby);
    }

    public void wypisz() {
        for (int i : liczby) {
            System.out.println(i);
        }
    }

    public int[] getLiczby() {
        return liczby;
    }
}
