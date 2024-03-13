import java.util.Scanner;

public class o10 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi = 1;
        int adet = 0;

        int kalan1, kalan2;

        do {
            kalan1 = sayi % 5;// 5ten kalan kaç
            kalan2 = sayi % 2;// 2 den kalan kaç

            // 5 tam bölünür ve 2 bölünmez ise
            if (kalan1 == 0 && kalan2 != 0) {
                adet++;                
            }
            sayi++;
        } while (sayi <= 1000);
        System.out.println(adet);
    }
}
