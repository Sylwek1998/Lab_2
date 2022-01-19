import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //zad.1
       Scanner scan = new Scanner((System.in));

        System.out.print("Podaj liczbę " );
        int a = scan.nextInt();
        switch (a % 2) {
            case 0:
                System.out.println("liczba jest parzysta");
                break;
            default:
                System.out.println("nieparzysta");
                break;
        }

        switch (a % 7) {
            case 0:
                System.out.println("jest podzielna ");
                break;
            default:
                System.out.println("nie jest podzielna");
                break;
        }

        //zad.2
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablica = {0, 0, 0, 0, 0, 0};
        /* toCharArray() - metoda zamienia String na tablicę char[] */
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablica[0];
                    break;
                case 'p':
                    ++tablica[1];
                    break;
                case 'x':
                    ++tablica[2];
                    break;
                case 'z':
                    ++tablica[3];
                    break;
                case 'q':
                    ++tablica[4];
                    break;
                default:
                    ++tablica[5];
            }
        }
        System.out.printf("\nLiczba występuje\no: %d - razy\np: %d - razy\nx: %d - razy\nz: %d - razy\nq: %d - razy\npozostałe: %d - razy",
                tablica[0], tablica[1], tablica[2], tablica[3], tablica[4], tablica[5]);
    }
}
