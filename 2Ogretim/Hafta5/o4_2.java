public class o4_2 {
    public static void main(String[] args) {
        int kalan;
        int toplam;
        
        for (int sayi = 1; sayi <= 100; sayi++) {
            toplam = 0;
            for (int i = 1; i < sayi; i++) {
                kalan = sayi % i;
                if (kalan == 0)
                    toplam += i;

            }
            if (toplam == sayi)
                System.out.println(sayi+" mükemmel sayıdır");
            else
                System.out.println(sayi+" mükemmel değildir");
        }
    }
}
