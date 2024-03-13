public class o10 {
    public static void main(String[] args) {
        int kalan1, kalan2;
        int adet = 0;
        for (int sayi = 0; sayi <= 1000; sayi++) {
            
            kalan1 = sayi % 5;
            kalan2 = sayi % 2;
            if (kalan1 == 0 && kalan2 != 0)
                adet++;
        }
        System.out.println(adet);
    }
}
