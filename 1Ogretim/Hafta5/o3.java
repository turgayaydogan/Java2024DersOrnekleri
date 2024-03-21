/*
 * Kendisi hariç bütün pozitif çarpanları (tam bölenleri) 
 * toplamı, yine kendisine eşit olan sayılara 
 * "mükemmel sayı" denir. 
 * Örneğin 6=1+2+3, 28=1+2+4+7+14 gibi.
 * 
 * Sayı Gir:6
 * 
 * 1..5
 * 
 * 6 % 1 = 0 +
 * 6 % 2 = 0 +
 * 6 % 3 = 0 +
 * 6 % 4 = 2 
 * 6 % 5 = 1
 * 
 */

import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi;
        int toplam = 0;
        int kalan;

        System.out.println("Sayı Gir:");
        sayi = giris.nextInt();

        for (int i = 1; i < sayi; i++) {
            kalan = sayi % i;
            if (kalan == 0)// tam bölünür
                toplam += i;
        }

        if (toplam == sayi)
            System.out.println("Mükemmel sayıdır.");
        else
            System.out.println("Mükemmel değildir");

    }
}
