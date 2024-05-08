import java.util.Random;

public class o2 {
    public static void main(String[] args) {
        int[] sayilar1 = new int[20];
        Random rnd = new Random();

        for (int i = 0; i < sayilar1.length; i++) {
            sayilar1[i] = rnd.nextInt(50);// 0..49
            System.out.println(sayilar1[i]);
        }
        System.out.println("Tekler");
        int[] tekOlanlar = tekleriGetir(sayilar1);
        for (int i : tekOlanlar) {
            System.out.println(i);
        }
    }

    public static int[] tekleriGetir(int[] dizi) {
        int[] tekler;
        int elemanSayisi = 0;
        int kalan = 0;
        int yeniIndex = 0;
        for (int i = 0; i < dizi.length; i++) {
            kalan = dizi[i] % 2;
            if (kalan == 1)
                elemanSayisi++;
        }
        // yeni dizi tanımla ve ata
        tekler = new int[elemanSayisi];
        for (int i = 0; i < dizi.length; i++) {
            kalan = dizi[i] % 2;
            if (kalan == 1)
                tekler[yeniIndex++] = dizi[i];// tekler[yeniIndex]=dizi[i];yeniIndex++;
        }

        return tekler;
    }
}
