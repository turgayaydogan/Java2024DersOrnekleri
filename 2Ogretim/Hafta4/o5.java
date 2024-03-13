import java.util.Scanner;

public class o5 {
    public static void main(String[] args) {
        int bitis;
        int sayi = 0;
        int kalan;
        Scanner giris = new Scanner(System.in);

        System.out.println("Bitiş Sayısı:");
        bitis = giris.nextInt();

        do {
            // sıradaki sayının 7 bölümünden kalan kaç
            kalan = sayi % 7;
            if (kalan == 0)// sayi 7 tam bölünür
                System.out.println(sayi);
            sayi++;

        } while (sayi<=bitis);

    }
}
