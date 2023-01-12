package Mini_Projects.Shopping;

import java.util.Arrays;
import java.util.List;

public class Sarkuteri {

    public static void sarkuteri() {

        List<String> urunKodu = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10");
        String[] u = {"sucuk    ", "salam    ", "sosis    ", "Dana    ", "Kusbasi   ", "Kiyma    ", "Kofte   ", "Kasar   ", "KellePaca ", "Ciger   "};
        List<String> urun = Arrays.asList(u);
        List<Double> fiyat = Arrays.asList(220.45, 210.78, 260.6, 390.75, 140.50, 150.30, 120.3, 170.890, 180.7, 140.80);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");
        for (int i = 0; i < urun.size(); i++) {
            System.out.println("\t" + urunKodu.get(i) + "\t\t" + urun.get(i) + "\t\t" + fiyat.get(i) + "$");
        }
        Secim.secim(fiyat, urun, urunKodu);

    }
}