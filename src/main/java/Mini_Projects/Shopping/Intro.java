package Mini_Projects.Shopping;

import java.util.Scanner;

public class Intro {

    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void start() {
        slowPrint("......Alisverisin sevimli adresine hosgeldiniz........\n\n", 40);
        System.out.println("Alisverisi Sonlandirmak icin '0' a basiniz");
        System.out.println("500$ ve uzeri alisverisinizde %10 indirim uygulanmaktadir.");
        introduction();
    }

    public static void introduction() {
        Scanner scan = new Scanner(System.in);

        int secim = 0;

        do {
            System.out.println("Alisveris yapacaginiz bolumu seciniz:");
            System.out.print(
                    " Manav icin:     1 \n" +
                            " Sarkuteri icin: 2\n" +
                            " Market icin:    3\n");

            secim = scan.nextInt();
            if (secim == 0) {
                System.out.println("Iyi gunler diler yine bekleriz.");
                break;
            }
            if (secim == 1) {
                slowPrint("Manav bolumune yonlendiriliyorsunuz....", 30);
                Manav.manav();
            } else if (secim == 2) {
                slowPrint("Sarkuteri bolumune yonlendiriliyorsunuz....\n", 30);
                Sarkuteri.sarkuteri();
            } else if (secim == 3) {
                slowPrint("Market bolumune yonlendiriliyorsunuz....\n", 30);
                Market.market();
            } else {
                System.out.println("!!! Secim tanimli degil, Lutfen dogru bir secim yapiniz");

            }

        } while (!(secim == 1 || secim == 2 || secim == 3));

    }
}
