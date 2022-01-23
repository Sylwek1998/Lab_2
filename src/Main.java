
import java.util.ArrayList;
import java.util.List;
//ss
public class Main {

    public static void main(String[] args) {

        int[] tablica = new int[20];

        uzupelnijTablice(tablica);
        wypiszOtrzymaneWartosci(tablica);

    }

    public static void uzupelnijTablice(int[] tablicaDoUzupelnienia){
        int idx = 0;
        for(int i = 40; i>20; i--){
            tablicaDoUzupelnienia[idx++] = i;
        }
    }

    public static void wypiszOtrzymaneWartosci(int[] tablicaDoWypisania){
        for(int i : tablicaDoWypisania){
            System.out.printf("%d ", i);
        }
    }

}