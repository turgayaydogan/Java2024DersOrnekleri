public class o2_3 {
    public static void main(String[] args) {
        int sayi = 0;
        
        do {
            // sıradaki sayının 2 bölümünden kalanı
           
            if ((sayi % 2) == 1)// tek sayı ise
                System.out.println(sayi);
            sayi++;

        } while (sayi < 100);
    }
}
