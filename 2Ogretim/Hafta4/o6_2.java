import java.util.Scanner;

public class o6_2 {
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
            
            // 5 tam bölünür ve  2 bölünmez ise
            if (kalan1 == 0 && kalan2!=0) {
                System.out.println(sayi);
            }

            sayi++;

        } while (sayi <= bitis);
    }
}
