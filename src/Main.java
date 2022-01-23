


public class Main {

    public static void main(String[] args) {

        System.out.println("wynik: " + (metoda(8, 9) + metoda(2, 3, 4)));

    }

    public static int metoda(int a, int b){
        return a + b;
    }
    public static int metoda(int a, int b, int c){
        return a + b + c;
    }
}

