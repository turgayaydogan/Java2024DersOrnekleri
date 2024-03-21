/*
 * Kendisi hariç bütün pozitif çarpanları (tam bölenleri) 
 * toplamı, yine kendisine eşit olan sayılara 
 * "mükemmel sayı" denir. 
 * Örneğin 6=1+2+3, 28=1+2+4+7+14 gibi.
 * 
 *  5 % 1 = 0 + ise toplam = 0 + 1
 *  5 % 2 = 1
 *  5 % 3 = 2
 *  5 % 4 = 1
 *  
 * eğer toplam =sayı ise sayı mükemmel
 */

import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi;
        int kalan;
        int toplam = 0;

        System.out.println("Sayı Gir:");
        sayi = giris.nextInt();

        for (int i = 1; i < sayi; i++) {
            kalan = sayi % i;
            if (kalan == 0)
                toplam += i;

        }
        if (toplam == sayi)
            System.out.println("mükemmel sayıdır");
        else
            System.out.println("mükemmel değildir");

    }
}
