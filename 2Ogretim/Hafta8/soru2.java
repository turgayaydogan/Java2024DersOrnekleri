public class soru2 {
    public static void main(String[] args) {
        //TEST
        boolean sonuc = asalSayimi(5);
        System.out.println(sonuc);

        //TEST
        System.out.println(asalSayimi(10));
    }

    public static boolean asalSayimi(int sayi) {
        int adet = 0;
        int kalan;
        boolean asalMi;
        for (int i = 1; i <= sayi; i++) {
            kalan = sayi % i;
            if (kalan == 0)
                adet++;
        }
        if (adet == 2)// bu sayı asal sayıdır
            asalMi = true;
        else
            asalMi = false;

        return asalMi;
    }
}
