public class o3 {
    public static void main(String[] args) {
        int sayi = 0;
        int kalan;

        while (sayi < 100){
            // sıradaki sayının 2 bölümünden kalanı
            kalan = sayi % 2;
            if (kalan == 1)// tek sayı ise
                System.out.println(sayi);
            sayi++;

        } 
    }
}
