package Mini_Projects.Shopping;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fis {


   static List<String> sebetimUrun = new ArrayList<>();
   static List<Double> sepetimKilo = new ArrayList<>();
   static List<Double> sepetimFiyat = new ArrayList<>();

    public  static  void fis(){

        Scanner scan = new Scanner(System.in);
        DecimalFormat dd = new DecimalFormat("#.00");
        double toplamFiyat = 0;
        String secim;
        boolean a;

        do {
            a= false;
            for (Double w: sepetimFiyat) {
                toplamFiyat += w;
            }
            if (toplamFiyat>500){
                System.out.println("%10 indirim kazandiniz");
                toplamFiyat= toplamFiyat*0.9;

            }else {
                System.out.println("%10 indirim hakki icin "+ (dd.format(500-toplamFiyat)) +"$ daha alis veris yapmalisiniz ");
                System.out.println("Alisverise devam etmek icin d\n alisverisi bitirmek icin herhangi bir tusa basiniz");
                secim= scan.next();
                if (secim.equals("d")) {
                    Intro.introduction();
                    continue;
                }
            }
            Intro.slowPrint("-**Fisiniz**-\n",80);

            for (int i = 0; i < sepetimFiyat.size(); i++) {

                System.out.println("Urun: "+sebetimUrun.get(i)+" kilo : "+ sepetimKilo.get(i)+" Tutar : "+dd.format(sepetimFiyat.get(i))+"$");

            }
            System.out.println("Toplam Tutar: "+ dd.format(toplamFiyat)+"$" );


            DateTimeFormatter dff = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm-ss");
            System.out.println("Tarih: "+dff.format(LocalDate.now()) +" // "+dtf.format(LocalTime.now()));

            Intro.slowPrint("Bizi tercih ettiginiz icin tesekkurler... Saglikli gunler dileriz.",60);

        }while (a);
    }

}
