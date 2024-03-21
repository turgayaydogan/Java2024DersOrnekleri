import java.util.Scanner;

public class o1_2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi=0;
        int toplam = 0;
        int adet = 0;

        while (sayi>=0) {
            System.out.println("Sayı Gir:");
            sayi = giris.nextInt();

            if (sayi > 10) {
                toplam += sayi;
                adet++;
            }
        } 
        System.out.println(toplam);
        System.out.println(adet);
    }
}
