import java.util.Scanner;

/**
 * o1
 */
public class o1 {

    public static void main(String[] args) {
        //Test 1
        //System.out.println(enBuyukBul());

        //Test 2
        int sonuc;
        sonuc = enBuyukBul();
        System.out.println(sonuc);
    }

    public static int enBuyukBul() {
        Scanner giris = new Scanner(System.in);

        int EBS = 0;
        int sayi;

        for (int i = 0; i < 10; i++) {
            System.out.print("Sayı Gir:");
            sayi = giris.nextInt();

            if (i == 0)// ilk veri girişi EBS değişir
                EBS = sayi;

            if (sayi > EBS)
                EBS = sayi;
        }

        return EBS;

    }
}