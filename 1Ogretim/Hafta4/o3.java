import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        int baslangic, bitis, kalan1, kalan2;

        Scanner giris = new Scanner(System.in);

        System.out.println("Başlangıç:");
        baslangic = giris.nextInt();

        System.out.println("Bitiş:");
        bitis = giris.nextInt();

        do {
            kalan1 = baslangic % 8;
            kalan2 = baslangic % 5;

            if (kalan1 == 0) {// sıradaki sayı 8 tam bölünür

                // siradaki sayı 5 tam bölünmez ise
                if (kalan2 == 1 || kalan2 == 2 || kalan2 == 3 || kalan2 == 4)
                    System.out.println(baslangic);

            }

            //siradaki sayıyı 1 arttır ve sona s-doğru ilerle
            baslangic++;

        } while (baslangic<=bitis);//sona ulaşıp ulaşmama

    }
}
