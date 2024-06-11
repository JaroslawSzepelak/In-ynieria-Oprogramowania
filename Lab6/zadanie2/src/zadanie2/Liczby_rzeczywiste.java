package zadanie2;

import java.util.Arrays;

public class Liczby_rzeczywiste {
    private double[] liczby;

    public Liczby_rzeczywiste(double[] liczby) {
        this.liczby = liczby;
    }

    public void sortuj() {
        Arrays.sort(liczby);
    }

    public void wypisz() {
        for (double d : liczby) {
            System.out.println(d);
        }
    }

    public double[] getLiczby() {
        return liczby;
    }
}