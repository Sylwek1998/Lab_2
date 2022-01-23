
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //a
        Set<Integer> mojSet = new HashSet<>();
        uzupelnij(mojSet);
        System.out.println(mojSet.toString());
        //b
        wyswietl(mojSet);

    }

    public static void uzupelnij(Set inSet) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj liczbe " + i + ": ");
            inSet.add(scan.nextInt());
        }
    }

    public static void wyswietl(Set<Integer> inSet) {

        System.out.println("Rozmiar set-a: " + inSet.size());

        for (Integer i : inSet) {
            System.out.printf("%d ", i);
        }

        System.out.println();
    }

}
