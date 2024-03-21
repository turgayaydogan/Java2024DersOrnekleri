/*
Klavyeden negatif sayı girilinceye kadar 10 dan 
büyük sayıları toplayan ve bu sayıların âdetini bulan 
programın kodlarını yazınız.

sayı girişi olacak?
10 dan büyük olanların toplamı
10 dan büyük olanların adetini

bu işlemler girilen sayı negatif oluncaya devam edecek
eğer girilen sayı negatif değil ise tekrar sayı girişi olacak

*/

import java.util.Scanner;

/**
 * o1
 */
public class o1 {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        int adet = 0;

        do {
            System.out.println("Sayı Gir:");
            sayi = giris.nextInt();

            if (sayi > 10) {
                toplam += sayi;
                adet++;
            }
        } while (sayi>=0);

        System.out.println(toplam);
        System.out.println(adet);

    }
}
