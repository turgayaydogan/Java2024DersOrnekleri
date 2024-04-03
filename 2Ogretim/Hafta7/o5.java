public class o5 {
    public static void main(String[] args) {
        // dizinin en küçük elemanını bul
        // ilk değer en küçük sayı olarak alınır
        // dizinin her bir elemanı sırayla EKS ile kıyaslanır
        // sıradaki eleman EKS dan küçük ise artık EKS sıradaki eleman olur
        int[] sayilar = { 10, 5, 2, 3, 9 };
        int EKS;
        EKS = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < EKS)
                EKS = sayilar[i];
        }
        System.out.println("En Küçük Sayı="+EKS);
    }
}
