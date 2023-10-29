package diziler;

import java.util.Random;
import java.util.Scanner;

public class odevSayi {
    public static void main(String[] args) {
        /**
         * 5 adet hakkımız olacak
         * program baslangıcata bize rastgele bir sayı üretecek  (1 ile 750 arası sayı uretsin)
         * hakkımız bitene kadar tahminde bulunacagız
         * eger tahmin ettiğimiz sayi uretilen sayıdan buyuk ise tahmininizi azaltın
         * eger tahmin ettiğimiz sayi uretilen sayıdan kucuk ise tahmininizi arttıralım
         * eger bir hakkımızda sayıyı tahmin edebilmişsek program sonlansın
         * eger edememissek ve hakkmız bitmiş ise bir uzgunuz tahmin hakkınız bitti diye bir cıktı verelim
         * ve  önce ki tahminlermizide bir arrayde tutalım oyun sonunda da tahminleriniz diye yazdıralım
         */
        System.out.println("Sayı Tahmin oyununa hoşgeldiniz");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int sayi = rand.nextInt(751);
        int [] tahminler =new int[5];
        int i=0;
        System.out.println("1 ile 750 arasında bir sayı giriniz");


        int tahmin;
        int can =5;
        while(can>0){
            System.out.println("Tahmininiz: ");
            tahmin = sc.nextInt();
            tahminler[i++]=tahmin;
            if((tahmin<0)||(tahmin>751)) {
                System.out.println("İstenilen sayı değerlerinde sayı giriniz");
                can--;

            }
            else if((tahmin>0)||(tahmin<751)) {

            if (tahmin==sayi){
                System.out.println("Doğru Tahmin");
                break;
            }
            else if (tahmin>sayi){
                can--;
                if(can==0){
                    System.out.println("Üzgünüz tahmin hakkınız bitti");
                    break;
                }
                System.out.println("Tahmininiz sayıdan yüksek tahmin sayınızı AZALTIN");



            }
            else if (tahmin<sayi) {
                can--;
                if(can==0){
                    System.out.println("Üzgünüz tahmin hakkınız bitti");
                    break;
                }

                System.out.println("Tahmin sayıdan düşük tahmin sayısını ARTTIRIN");


            }}



        }
        System.out.println("Sayı tahminleriniz: ");
        for ( int value: tahminler){
            if (value!=0)
            System.out.print(value + ",");
        }
        System.out.println();
        System.out.println("Tahmin edilmek istenen sayı: "+sayi);


    }
}
