


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        wypisz("Michal");
        System.out.println();
        wypisz("Michal", "Sylwestrzak");
        System.out.println();
        wypisz("Michal", "Sylwestrzak", 23);
        System.out.println();

    }

    public static void wypisz(String imie){
        System.out.printf("%s", imie);
    }

    public static void wypisz(String imie, String nazwisko){
        System.out.printf("%s %s", imie, nazwisko);
    }

    public static void wypisz(String imie, String nazwisko, int wiek){
        System.out.printf("%s %s %d", imie, nazwisko, wiek);
    }
}