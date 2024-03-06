import java.util.Scanner;

public class o5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1, sayi2, sonuc=0;
        String secim;

        System.out.println("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2 = giris.nextInt();

        System.out.println("Hesaplama İşlemi(+,-,*,/):");
        secim = giris.nextLine();

        if (secim.equals("+"))
            sonuc = sayi1 + sayi2;
        else if (secim.equals("-"))
            sonuc = sayi1 - sayi2;
        else if (secim.equals("*"))
            sonuc = sayi1 * sayi2;
        else if (secim.equals("/"))
            sonuc = sayi1 / sayi2;


        System.out.println("Hesaplama Sonucu=" + sonuc);
    }
}
