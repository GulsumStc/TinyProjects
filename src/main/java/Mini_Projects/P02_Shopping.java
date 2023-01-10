package Mini_Projects;

import java.text.DecimalFormat;
import java.util.*;

public class P02_Shopping {


    /*
   * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
      1 manav,
      2 sarkuteri,
      3 market
      secime gore,
      4-urunleri listele ve
      5-fiyatlari gelsin
   *

      1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.

      No   Ürün    Fiyat
     ===== ======= ========
      00  Domates 2.10 TL ,
      01 Patates 3.20 TL ,
      02 Biber 1.50 TL ,
      03 Soğan 2.30 TL  ,
      04 Havuç 3.10 TL
      05 Elma 1.20 TL
      06 Muz 1.90 TL
      07 Çilek 6.10 TL
      08 Kavun 4.30 TL
      09 Üzüm 2.70 TL
      10 Limon 0.50 TL
   *
   * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
      * 3. Adım: Kaç kg satın almak istediğini sorunuz.
        4. Adım: Alınacak bu ürünü
   * sepete ekleyiniz ve Sepeti yazdırınız.
       5. Başka bir ürün alıp almak
   * istemediğini sorunuz.
       6. Eğer devam etmek istiyorsa yeniden ürün seçme
   * kısmına yönlendiriniz.
       7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
   * ödeme sonrasında programı bitiriniz
   */

    public static void main(String[] args) {

        introduction();

    }

    public static void introduction() {
        Scanner scan = new Scanner(System.in);

        slowPrint("......Alisverisin sevimli adresine hosgeldiniz........\n\n", 40);

        int secim = 0;

        System.out.println("Alisverisi Sonlandirmak icin '0' a basiniz");

        do {
            System.out.println("Alisveris yapacaginiz bolumu seciniz:");
            System.out.println(
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
                manav();
            } else if (secim == 2) {
                slowPrint("Sarkuteri bolumune yonlendiriliyorsunuz....\n", 30);
                sarkuteri();
            } else if (secim == 3) {
                slowPrint("Market bolumune yonlendiriliyorsunuz....\n", 30);
                market();
            } else {
                System.out.println("!!! Secim tanimli degil, Lutfen dogru bir secim yapiniz");

            }

        } while (!(secim == 1 || secim == 2 || secim == 3));

    }

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
        }

    }

    private static void sebze() {

        List<String> urunKodu = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10");
        List<String> urun = Arrays.asList("Domates   ", "Patlican  ", "Biber    ", "Soğan     ", "Havuç    ", "Brokoli   ",
                "Karnibahar", "Salata  ", "Kabak   ");
        List<Double> fiyat = Arrays.asList(2.45, 2.78, 2.6, 3.75, 4.50, 5.30, 12.3, 17.89, 8.7, 4.80);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");
        for (int i = 0; i < urun.size(); i++) {
            System.out.println("\t" + urunKodu.get(i) + "\t\t" + urun.get(i) + "\t\t" + fiyat.get(i));
        }

        secim(fiyat,urun,urunKodu);

    }

    private static void meyve() {
        List<String> urunKodu = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10");
        String[] meyv = {"Elma     ", "Portakal ", "Muz      ", "Mandalina", "Çilek    ", "Kavun    ", "Ananas   ", "Üzüm     ", "Limon    ", "Avokado  "};
        List<String> meyve = Arrays.asList(meyv);
        List<Double> fiyat = Arrays.asList(22.45, 21.78, 26.6, 39.75, 14.50, 15.30, 12.3, 17.89, 18.7, 14.80);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");
        for (int i = 0; i < meyve.size(); i++) {
            System.out.println("\t" + urunKodu.get(i) + "\t\t" + meyve.get(i) + "\t\t" + fiyat.get(i));
        }
        secim(fiyat,meyve,urunKodu);

    }


    public static void sarkuteri(){

        List<String> urunKodu = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10");
        String[] u = {"sucuk    ", "salam    ", "sosis    ", "Dana    ", "Kusbasi   ", "Kiyma    ", "Kofte   ", "Kasar   ", "KellePaca ", "Ciger   "};
        List<String> urun = Arrays.asList(u);
        List<Double> fiyat = Arrays.asList(220.45, 210.78, 260.6, 390.75, 140.50, 150.30, 120.3, 170.890, 180.7, 140.80);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");
        for (int i = 0; i < urun.size(); i++) {
            System.out.println("\t" + urunKodu.get(i) + "\t\t" + urun.get(i) + "\t\t" + fiyat.get(i));
        }
        secim(fiyat,urun,urunKodu);

    }

    public static void market(){

        List<String> urunKodu = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10");
        String[] u = {"Biskuvit ", "Cikolata  ", "Makarna   ", "Yag      ", "Deterjan  ", "Pecete   ",
                      "Sakiz   ", "Pasta   ", "Boya    ", "cips     "};
        List<String> urun = Arrays.asList(u);
        List<Double> fiyat = Arrays.asList(22.45, 21.78, 26.6, 39.75, 14.50, 15.30, 12.3, 17.890, 18.7, 14.80);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");
        for (int i = 0; i < urun.size(); i++) {
            System.out.println("\t" + urunKodu.get(i) + "\t\t" + urun.get(i) + "\t\t" + fiyat.get(i));
        }
        secim(fiyat,urun,urunKodu);

    }
    public static void secim(List<Double> fiyat, List<String> urun, List<String > urunKodu){

        Scanner scan = new Scanner(System.in);
        String urunK = "";
        double kilo = 0;
        double toplamFiyat = 0;
        String devamTamam = "";

        List<String> sebetimUrun = new ArrayList<>();
        List<Double> sepetimKilo = new ArrayList<>();
        List<Double> sepetimFiyat = new ArrayList<>();
        DecimalFormat dd = new DecimalFormat("#.00");
        boolean a = false;

        do {

            System.out.println("Isteginiz urunun kodunu  seciniz");
            urunK = scan.next();

            for (int i = 0; i < urunKodu.size() ; i++) {

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

                sebetimUrun.add(urun.get(urunKodu.indexOf(urunK)));
                sepetimFiyat.add(toplamFiyat);
                sepetimKilo.add(kilo);

                System.out.println(kilo+ " kilo " + urun.get(urunKodu.indexOf(urunK)) + "= " + dd.format(toplamFiyat));

            System.out.println("Istediginiz baska urun varsa 'y' yoksa herhangi bir tusa basiniz...");
            devamTamam = scan.next();

            if (devamTamam.equals("y")) {

                a = true;

            } else {

               slowPrint("Odeme kismina yonlendiriliyorsunuz...\n",80);
                break;
            }

        } while (true);

        double toplam = 0;

        slowPrint("**Fisiniz**\n",80);

        for (int i = 0; i < sepetimFiyat.size(); i++) {

            System.out.println("Urun: "+sebetimUrun.get(i)+" kilo : "+ sepetimKilo.get(i)+"Tutar : "+dd.format(sepetimFiyat.get(i)));
            toplam+=sepetimFiyat.get(i);

        }
        System.out.println("Toplam Tutar: "+ dd.format(toplam) );

        slowPrint("Bizi tercih ettiginiz icin tesekkurler... Saglikli gunler dileriz.",60);


    }


}





