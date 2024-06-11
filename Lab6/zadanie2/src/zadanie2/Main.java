package zadanie2;

public class Main {
    public static void main(String[] args) {
        // Przykład dla tablicy tekstowej
        String[] textArray = {"banana", "apple", "cherry"};
        Tekst tekst = new Tekst(textArray);
        Facade facadeText = new Facade(tekst);
        facadeText.sortuj();
        System.out.println("Sorted text array:");
        facadeText.wypisz();

        // Przykład dla tablicy liczb całkowitych
        int[] intArray = {3, 1, 2};
        Liczby_całkowite liczbyCałkowite = new Liczby_całkowite(intArray);
        Facade facadeInt = new Facade(liczbyCałkowite);
        facadeInt.sortuj();
        System.out.println("Sorted integer array:");
        facadeInt.wypisz();

        // Przykład dla tablicy liczb rzeczywistych
        double[] doubleArray = {3.3, 1.1, 2.2};
        Liczby_rzeczywiste liczbyRzeczywiste = new Liczby_rzeczywiste(doubleArray);
        Facade facadeDouble = new Facade(liczbyRzeczywiste);
        facadeDouble.sortuj();
        System.out.println("Sorted double array:");
        facadeDouble.wypisz();
    }
}
