import java.util.Random;

import javax.naming.ldap.Rdn;

public class o7 {
    public static void main(String[] args) {
        // 20 elemanlı diziye rastgele değer ata
        // elemanların kaç tanesi
        // dizinin aritmatik ortalamasından küçük adetini bul
        Random rnd = new Random();
        int[] sayilar = new int[20];
        int toplam = 0;
        int ortalama = 0;
        int adet = 0;

        // rastgele değer ata
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(100);// 0..99
            System.out.println(sayilar[i]);
        }
        // ortalama bul
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        ortalama = toplam / sayilar.length;
        System.out.println("Dizinin Ortalaması=" + ortalama);
        // ortalamadan küçüklerin adetini bul
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < ortalama)
                adet++;
        }
        System.out.println(adet);

    }
}
