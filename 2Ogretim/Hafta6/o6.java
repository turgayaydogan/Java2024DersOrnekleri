import java.util.Random;

public class o6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] sayilar = new int[20];
        int adet = 0;
        int toplam = 0;
        int ortalama;
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(100);// 0..99
            toplam += sayilar[i];
            System.out.println(sayilar[i]);
        }
        ortalama = toplam / sayilar.length;
        // ortalama = toplam / 20;

        System.out.println("Dizi Ortalaması=" + ortalama);
        // ortalamadan büyük eleman sayısını bul
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > ortalama)
                adet++;
        }
        System.out.println("Ortalamadan büyük eleman adeti="+adet);

    }
}
