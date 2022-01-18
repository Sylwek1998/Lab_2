import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //zad.1
      /*  Scanner scan = new Scanner((System.in));

        System.out.print("Podaj liczbę " );
        int[] a;
        switch (a % 2) {
            case 0:

                System.out.println("liczba jest parzysta");
                break;
            case 1:
                System.out.println("liczba nie jest parzysta");
                break;
            case 2:
                System.out.println("liczba dzieli się przez 7");
                break;
            default:
            case 3:
                System.out.println("nie dzieli się przez 7 ");
                break;

        }
*/
        //zad.2
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablica = {0, 0, 0, 0, 0};
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
            }
        }
        System.out.printf("\nLiczba występuje\no: %d - razy\np: %d - razy\nx: %d - razy\nz: %d - razy\nq: %d - razy",
                tablica[0], tablica[1], tablica[2], tablica[3], tablica[4]);
    }
}
