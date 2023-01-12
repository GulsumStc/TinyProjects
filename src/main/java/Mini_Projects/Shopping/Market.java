package Mini_Projects.Shopping;

import java.util.Arrays;
import java.util.List;

public class Market {

    public static void market() {

        List<String> urunKodu = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10");
        String[] u = {"Biskuvit ", "Cikolata  ", "Makarna   ", "Yag      ", "Deterjan  ", "Pecete   ",
                "Sakiz   ", "Pasta   ", "Boya    ", "cips     "};
        List<String> urun = Arrays.asList(u);
        List<Double> fiyat = Arrays.asList(22.45, 21.78, 26.6, 39.75, 14.50, 15.30, 12.3, 17.890, 18.7, 14.80);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");
        for (int i = 0; i < urun.size(); i++) {
            System.out.println("\t" + urunKodu.get(i) + "\t\t" + urun.get(i) + "\t\t" + fiyat.get(i) + "$");
        }
        Secim.secim(fiyat, urun, urunKodu);

    }
}