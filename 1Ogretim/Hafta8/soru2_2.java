public class soru2_2 {
    public static void main(String[] args) {
        System.out.println("Kullanıma Örnek");
        System.out.println(asalSayi(6));
        System.out.println(asalSayi(7));

        boolean sonuc = asalSayi(10);
        System.out.println(sonuc);
    }

    public static boolean asalSayi(int sayi) {
        //boolean sonuc = false;
        int adet = 0;
        for (int i = 1; i <= sayi; i++) {
            int kalan = sayi % i;
            if (kalan == 0)
                adet++;
        }
        if (adet == 2)
            return true;// eğer sayı asal ise
        else
            return false;  // eğer sayı asal değilise      
    }
}
