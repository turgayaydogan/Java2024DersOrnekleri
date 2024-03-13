import java.util.Scanner;

public class o11_2 {
    public static void main(String[] args) {
         Scanner giris = new Scanner(System.in);
        int sayi1, sayi2, sonuc;
        char secim='e';

        while (secim =='e') {
            System.out.println("Sayı1:");
            sayi1 = giris.nextInt();

            System.out.println("Sayı2:");
            sayi2 = giris.nextInt();

            sonuc = sayi1 + sayi2;
            System.out.println(sonuc);

            System.out.println("Tekrar hesaplama yapmak istiyormusun?");
            secim = giris.next().charAt(0);
        } 
    }
}
