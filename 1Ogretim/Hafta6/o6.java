import java.util.Random;

public class o6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] sayilar = new int[100];
        for (int i = 0; i < sayilar.length; i++)
            sayilar[i] = rnd.nextInt(200);// 0..199

        // a)100 den büyük elemanların adeti
        int adet1 = 0;
        for (int i = 0; i < sayilar.length; i++)
            if (sayilar[i] > 100)
                adet1++;
        System.out.println("100 den büyük sayı adeti=" + adet1);
        // b)100 den küçük sayıların ortalaması
        int adetB = 0;
        int ortalamaB;
        int toplamB = 0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < 100) {
                adetB++;
                toplamB += sayilar[i];
            }
        }
        ortalamaB = toplamB / adetB;
        System.out.println("100 den küçük olan sayıların ortalaması=" + ortalamaB);

        // c) çift sayı adeti
        int adetC = 0;
        for (int i = 0; i < sayilar.length; i++) {
            int kalan = sayilar[i] % 2;
            if (kalan == 0)
                adetC++;
        }
        System.out.println("Çift Sayı Adeti="+adetC);
    }
}
