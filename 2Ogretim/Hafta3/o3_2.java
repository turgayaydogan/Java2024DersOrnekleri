import java.util.Scanner;

public class o3_2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1, sayi2, sonuc;
        char secim;

        System.out.println("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2 = giris.nextInt();

        System.out.println("Hesaplama İşlemi(+,-,*,/):");
        secim = giris.next().charAt(0);

        if (secim == '+'){
            sonuc = sayi1 + sayi2;
            System.out.println("Hesaplama Sonucu=" + sonuc);
        }

        if (secim == '-'){
            sonuc = sayi1 - sayi2;
            System.out.println("Hesaplama Sonucu=" + sonuc);
        }

        if (secim == '*'){
            sonuc = sayi1 * sayi2;
            System.out.println("Hesaplama Sonucu=" + sonuc);
        }

        if (secim == '/'){
            sonuc = sayi1 / sayi2;
            System.out.println("Hesaplama Sonucu=" + sonuc);
        }


        
    }
}
