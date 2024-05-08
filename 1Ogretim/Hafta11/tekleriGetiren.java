import java.util.Random;

/**
 * tekleriGetiren
 * 11. int[] tekleriGetir(int[] dizi) kendisine parametre olarak
 * gelen diziden elemanları tek olanları geriye döndüren metodu yazınız.
 */
public class tekleriGetiren {

    public static void main(String[] args) {
        int[] sayilar = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(50);// 0..49
            System.out.println(sayilar[i]);
        }

        int[] tekOlanlar = tekleriGetir(sayilar);
        System.out.println("Tek Oln Dizi Elemanları");
        for (int i = 0; i < tekOlanlar.length; i++) {
            System.out.println(tekOlanlar[i]);
        }
    }

    public static int[] tekleriGetir(int[] gelenDizi) {
        // gelenDizide tek elemanların adetini bul
        // bunları yeni bir diziye ata

        int[] yeniDizi;
        int elemanSayisi = 0;
        int kalan = 0;
        int siraNo =0;

        for (int i = 0; i < gelenDizi.length; i++) {
            kalan = gelenDizi[i] % 2;
            if (kalan == 1)
                elemanSayisi++;
        }
        // yeniDizi elemanSayısını belirle
        yeniDizi = new int[elemanSayisi];
        // yeniDizi ye tek elemanları ata

        for (int i = 0; i < gelenDizi.length; i++) {
            kalan = gelenDizi[i] % 2;
            if (kalan == 1)
                yeniDizi[siraNo++] = gelenDizi[i]; //yeniDizi[siraNo] = gelenDizi[i];siraNo++;
        }

        return yeniDizi;
    }
}