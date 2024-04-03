public class o5_2 {
    public static void main(String[] args) {
        // dizinin en küçük elemanını bul
        // ilk değer en küçük sayı olarak alınır
        // dizinin her bir elemanı sırayla EKS ile kıyaslanır
        // sıradaki eleman EKS dan küçük ise artık EKS sıradaki eleman olur
        int[] sayilar = { 10, 5, 2, 3, 9 };
        int EKS=0;//buraya hangi değeri atarsak atayalım 12.satırda 1 kere değişecek

        for (int i = 0; i < sayilar.length; i++) {
            if (i == 0)
                EKS = sayilar[i];

            if (sayilar[i] < EKS)
                EKS = sayilar[i];
        }
        System.out.println("En Küçük Sayı=" + EKS);
    }
}
