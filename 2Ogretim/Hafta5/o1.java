/*
 * Klavyeden negatif sayı girilinceye kadar 
 * 10 dan büyük sayıları toplayan 
 * ve bu sayıların âdetini bulan programın kodlarını yazınız.

 sayı gir
 girilen sayı 10 dan büyük ise topla
 girilen sayı 10 dan büyükse adet say

 girilen sayı negatif değil ise tekrarla
 girilen sayı negatif ise dur

 */

import java.util.Scanner;

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