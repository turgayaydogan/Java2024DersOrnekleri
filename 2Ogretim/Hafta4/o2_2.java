public class o2_2 {
    public static void main(String[] args) {
        int sayi = 0;
        int kalan;

        do {
            // sıradaki sayının 2 bölümünden kalanı
            kalan = sayi % 2;
            if (kalan == 1)// tek sayı ise
                System.out.println(sayi);
            sayi++;

        } while (sayi < 100);
    }
}
