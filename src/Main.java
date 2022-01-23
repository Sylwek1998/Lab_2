
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //a
        List<String> mojaLista = new ArrayList<>();
        uzupelnij(mojaLista);
        //b
        wyswietl(mojaLista);
        //c
        mojaLista.remove(mojaLista.size() - 1);
        mojaLista.remove(mojaLista.size() - 2);
        mojaLista.add("Karol");
        mojaLista.add("Karol1");
        mojaLista.add("Karol2");
        mojaLista.add("Karol3");

        wyswietl(mojaLista);

        //d
        mojaLista.sort(Comparator.naturalOrder());
        wyswietl(mojaLista);
        mojaLista.sort(Comparator.reverseOrder());
        wyswietl(mojaLista);
    }

    public static void uzupelnij(List nazwaListy) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("Podaj nazwę zwierzęcia " + i + ": ");
            nazwaListy.add(scan.nextLine());
        }
    }

    public static void wyswietl(List<String> nazwaListy) {

        System.out.println("Rozmiar listy: " + nazwaListy.size());

        for (String nazwa : nazwaListy) {
            System.out.printf("%s ", nazwa);
        }

        System.out.println();
    }


}

