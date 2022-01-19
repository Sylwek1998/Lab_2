public class Main {
    public static void main(String[] args) {

        //zad.1
          int i = 1000;
        System.out.println("\n");
        do {
            System.out.println("i: " + i);
        } while (--i >= 0);

         i = 1000;
        System.out.println("\n");
        do {
       //     System.out.println("i: " + i);
            if (i % 59 == 0){
                System.out.println("54159-indeks. liczba " + i + " jest podzielna prze 59.");
            }
        } while (--i >= 0);

        //zad.2
         int[] tab = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;
        System.out.println(tab.length);
         i = 0;
        while (i < tab.length) {
            System.out.println("tab[" + i + "]: " + tab[i]);
            i++;
        }

        double[] tab2 = new double[]{ 0.1d, 0.2d, 0.3d, 0.4d, 0.5d };
        System.out.println(tab2.length);
        i = 0;
        while (i < tab2.length) {
            System.out.println("tab2[" + i + "]: " + tab2[i]);
            i++;
        }

        String[] tab3 = new String[]{ "ala", "basia", "celina", "daria", "ela"
        };
        System.out.println(tab3.length);
        i = tab3.length - 1;
        while (i >= 0) {
            System.out.println("tab3[" + i + "]: " + tab3[i]);
            i--;
        }

        //zad.3
        //a
        while (true) {
            System.out.println("michal");
        }
        //b
      /*  while(false){
            System.out.println("michal");
        }

       */
    }
}
