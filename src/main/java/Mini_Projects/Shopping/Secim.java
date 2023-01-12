package Mini_Projects.Shopping;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class Secim {

    public static void secim(List<Double> fiyat, List<String> urun, List<String> urunKodu) {

        Scanner scan = new Scanner(System.in);

        DecimalFormat dd = new DecimalFormat("#.00");

        String urunK = "";
        double kilo = 0;
        double toplamFiyat = 0;
        String devamTamam = "";
        boolean a = false;

        do {

            System.out.println("Isteginiz urunun kodunu  seciniz");
            urunK = scan.next();

            if (!urunKodu.contains(urunK)) {
                System.out.println("Tanimsiz urun, Tekrar secim yapiniz");
                a = true;
                continue;
            }

            for (int i = 0; i < urunKodu.size(); i++) {

                if (urunK.equals(urunKodu.get(i))) {
                    System.out.println("Secilen Urun: " + urun.get(i));
                    break;
                }
            }

            System.out.println("Isteginiz miktari  giriniz");
            kilo = scan.nextDouble();

            for (int i = 0; i < fiyat.size(); i++) {

                if (urunK.equals(urunKodu.get(i))) {
                    toplamFiyat = kilo * fiyat.get(i);
                    break;
                }
            }
            System.out.print("**Sepete eklendi: ");

            Fis.sebetimUrun.add(urun.get(urunKodu.indexOf(urunK)));
            Fis.sepetimFiyat.add(toplamFiyat);
            Fis.sepetimKilo.add(kilo);

            System.out.println(kilo + " kilo " + urun.get(urunKodu.indexOf(urunK)) + "= " + dd.format(toplamFiyat) + "$");

            Intro.slowPrint("Bu reyondan istediginiz baska urun varsa 'y' diger reyonlar icin 'd' yoksa herhangi bir tusa basiniz...", 20);
            devamTamam = scan.next();
            if (devamTamam.equals("d")) {
                Intro.introduction();
            } else if (devamTamam.equals("y")) {
                a = true;

            } else {

                Intro.slowPrint("Odeme kismina yonlendiriliyorsunuz...\n", 80);
                Fis.fis();
                a = false;
            }

        } while (a);

    }
}