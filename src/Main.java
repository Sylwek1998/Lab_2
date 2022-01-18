import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //zad.1
        for (int i = 0; i <= 134; i++) {
            if (i == 45)
                break;
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (int i = 0; i <= 142; i++) {
            if (i % 4 == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (int i = 6; i <= 99; i++) {
            if (i == 69)
                return;
            System.out.print(i + " ");

        }
    }
}
