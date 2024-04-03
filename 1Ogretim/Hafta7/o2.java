public class o2 {
    // ilk elemanı EKS al
    // dizinin sıradaki elemanını EKS ile karşılaştır
    // eğer sıradaki eleman EKS den küçükse artık EKS=sıradakaki eleman
    // dizinin son elemanına kadar devam et

    public static void main(String[] args) {
        int[] sayilar = { 5, 4, 3, 9, 10, 15 };
        int eks;
        eks = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < eks)
                eks = sayilar[i];
        }
        System.out.println(eks);
    }
}
