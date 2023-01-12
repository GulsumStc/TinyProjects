package Mini_Projects.Shopping;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Manav {

    public static void manav() {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.println("Sebze Reyonu icin: 1\n" +
                "Meyve Reyonu icin: 2\n");

        int reyonSec = scan.nextInt();

        if (reyonSec == 1) {
            sebze();
        } else if (reyonSec == 2) {
            meyve();
        }else {
            System.out.println("tanimsiz reyon...");
            manav();
        }

    }

    private static void sebze() {

        List<String> urunKodu = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10");
        List<String> urun = Arrays.asList("Domates   ", "Patlican  ", "Biber    ", "Soğan     ", "Havuç    ", "Brokoli   ",
                "Karnibahar", "Salatalik ", "Kabak   ");
        List<Double> fiyat = Arrays.asList(2.45, 2.78, 2.6, 3.75, 4.50, 5.30, 12.3, 17.89, 8.7, 4.80);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");
        for (int i = 0; i < urun.size(); i++) {
            System.out.println("\t" + urunKodu.get(i) + "\t\t" + urun.get(i) + "\t\t" + fiyat.get(i));
        }

        Secim.secim(fiyat,urun,urunKodu);

    }

    private static void meyve() {
        List<String> urunKodu = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10");
        String[] meyv = {"Elma     ", "Portakal ", "Muz      ", "Mandalina", "Çilek    ", "Kavun    ", "Ananas   ", "Üzüm     ", "Limon    ", "Avokado  "};
        List<String> meyve = Arrays.asList(meyv);
        List<Double> fiyat = Arrays.asList(22.45, 21.78, 26.6, 39.75, 14.50, 15.30, 12.3, 17.89, 18.7, 14.80);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");
        for (int i = 0; i < meyve.size(); i++) {
            System.out.println("\t" + urunKodu.get(i) + "\t\t" + meyve.get(i) + "\t\t" + fiyat.get(i)+"$");
        }
        Secim.secim(fiyat,meyve,urunKodu);

    }
}
