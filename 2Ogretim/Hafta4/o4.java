public class o4 {
    public static void main(String[] args) {
        int kalan;
        for (int sayi = 0; sayi < 100; sayi++) {
            // sıradaki sayının 2 bölümünden kalanı
            kalan = sayi % 2;
            if (kalan == 1)// tek sayı ise
                System.out.println(sayi);
        }
        
    }
}
