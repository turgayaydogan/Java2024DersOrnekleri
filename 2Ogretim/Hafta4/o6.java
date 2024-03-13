import java.util.Scanner;

public class o6 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi = 0;
        int bitis;

        int kalan1, kalan2;

        System.out.println("Bitiş Sayısı:");
        bitis = giris.nextInt();

        do {
            kalan1 = sayi % 5;// 5ten kalan kaç
            kalan2 = sayi % 2;// 2 den kalan kaç

            if (kalan1 == 0) {// 5 tam bölünür ise
                if (kalan2 != 0)// 2 bölünmes ise
                    System.out.println(sayi);
            }

            sayi++;

        } while (sayi<=bitis);

    }
}
