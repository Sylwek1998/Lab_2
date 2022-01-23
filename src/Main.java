


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] tablica = new String[6];

        uzupelnijTablice(tablica);
        wypiszOtrzymaneWartosci(tablica);

    }

    public static void uzupelnijTablice(String[] tablicaDoUzupelnienia){
        Scanner scan= new Scanner(System.in);
        for(int i = 0; i< tablicaDoUzupelnienia.length; i++){
            System.out.print("Podaj tekst("+ i + "): ");
            tablicaDoUzupelnienia[i] =  scan.nextLine();
        }
    }

    public static void wypiszOtrzymaneWartosci(String[] tablicaDoWypisania){
        for(int i = tablicaDoWypisania.length -1; i >=0; i--){
            System.out.printf("%s ", tablicaDoWypisania[i]);
        }
    }

}