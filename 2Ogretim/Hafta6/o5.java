import java.util.Random;

public class o5 {
    public static void main(String[] args) {
        // 100 elemanlı dizi
        // 0-200 arasında değer ata
        int[] sayilar = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(200);// 0..199
            System.out.println(sayilar[i]);
        }
        // 100 den büyük sayı adeti
        int adet1 = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > 100)
                adet1++;
        }
        System.out.println("100 den büyük=" + adet1);
        // 100 den küçük sayıların ortalaması
        int adet2 = 0;// 100 den küçük sayıların adeti
        int toplam2 = 0;// 100 den küçük sayıların toplamı
        int ortalama2;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < 100) {
                adet2++;
                toplam2 += sayilar[i];
            }
        }
        ortalama2 = toplam2 / adet2;
        System.out.println("100 den küçük sayıların ortalaması=" + ortalama2);
        // çift sayıları bul
        int adet3 = 0;
        for (int i = 0; i < sayilar.length; i++) {
            int kalan = sayilar[i] % 2;
            if (kalan == 0)// sıradaki sayı çifttir
                adet3++;
        }
        System.out.println("Çift Sayı Adeti="+adet3);
    }
}
