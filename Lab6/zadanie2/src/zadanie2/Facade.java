package zadanie2;

public class Facade {

    private Tekst tekst;
    private Liczby_całkowite liczbyCałkowite;
    private Liczby_rzeczywiste liczbyRzeczywiste;

    public Facade(Tekst tekst) {
        this.tekst = tekst;
    }

    public Facade(Liczby_całkowite liczbyCałkowite) {
        this.liczbyCałkowite = liczbyCałkowite;
    }

    public Facade(Liczby_rzeczywiste liczbyRzeczywiste) {
        this.liczbyRzeczywiste = liczbyRzeczywiste;
    }

    public void sortuj() {
        if (tekst != null) {
            tekst.sortuj();
        } else if (liczbyCałkowite != null) {
            liczbyCałkowite.sortuj();
        } else if (liczbyRzeczywiste != null) {
            liczbyRzeczywiste.sortuj();
        }
    }

    public void wypisz() {
        if (tekst != null) {
            tekst.wypisz();
        } else if (liczbyCałkowite != null) {
            liczbyCałkowite.wypisz();
        } else if (liczbyRzeczywiste != null) {
            liczbyRzeczywiste.wypisz();
        }
    }
}
