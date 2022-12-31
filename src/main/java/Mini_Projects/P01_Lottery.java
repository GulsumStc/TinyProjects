package Mini_Projects;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P01_Lottery {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayisal loto icin hane sayisi giriniz");
        int slots = scan.nextInt();
        System.out.println("sayilar icin min deger giriniz: ");
        int min = scan.nextInt();
        System.out.println("sayilar icin maxdeger giriniz: ");
        int max = scan.nextInt();

        int[] lotoArray = new int[slots];//loto sayilari
        int[] ticketArray = new int[slots];// benim biletim

        //Rastgele sayilari olusturmak icin:
        //       1- Math.random() methodu 0-1 arasinda double degerler donduruyor.
        //       2 - random classtan object olusturuyoruz ordaki methodlari kullnamak icin

        Random random = new Random();//random class

        int randomNumber1 = 0;//loto sayim icin  slots kadar rastgele sayiya ihtiyacim var
        int randomNumber2 = 0;//biletim icin     slots kadar rastgele sayiya ihtiyacim var

        boolean isrepeated;

        for (int i = 0; i < slots; i++) {

            //random.nextInt(bound:10); //(0-10) arasinda sayilar uretiyor. 10 dahil degil.
            // [5-10] arasinda olsun istiyorum bound iki sinir deger kabul etmiyor sayi ekleyerek 5-10 yapabilirim

            do {//lotoArrayin icini dolduracagiz
                isrepeated = false;
                randomNumber1 = random.nextInt(max + 1 - min) + min;// burada sinirimi [min,max] olrak belirledim bu sayilar arasindan rasgale sayi uretsin istiyorum
                // uretil sayilarin karsilastirilmasi lazim tekrarli sayi olmamasi icin

                for (int j = 0; j < i; j++) {// uretilen her rastgele deger icin burada tum sayilarla kiyasliyorum

                    if (lotoArray[j] == randomNumber1) {
                        isrepeated = true;
                        break;
                    }
                }

            } while (isrepeated);

            lotoArray[i] = randomNumber1;

            do {//ticketArray'i dolduracagim

                isrepeated = false;
                randomNumber2 = random.nextInt(max + 1 - min) + min;
                for (int j = 0; j < i; j++) {

                    if (ticketArray[j] == randomNumber2) {

                        isrepeated = true;

                        break;
                    }
                }

            } while (isrepeated);

            ticketArray[i] = randomNumber2;


        }
        System.out.println(Arrays.toString(lotoArray));
        System.out.println(Arrays.toString(ticketArray));


    }


}
