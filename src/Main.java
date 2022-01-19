import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //zad.1
        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");


        }
        for (int i = 100; i >= 0; i--) {
            if (i % 9 == 0) {
                System.out.println(i);


            }
        }
        //zad.2

        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj liczbę: ");

            tab[i] = scan.nextInt() ;

        }

        for (int i : tab  ) {
            System.out.println(i+11);
        }
    }
}
