public class o2 {
    public static void main(String[] args) {
        int[] sayilar = { 1, 3, 5, -7, 9,-5 };
        int[] sayilar2;
        sayilar2 = diziKopyala(sayilar);

        sayilar[0] = 100;

        for (int i : sayilar2) {
            System.out.println(i);
        }

        System.out.println("***********");
        System.out.println(diziEKS(sayilar2));
    }

    public static int[] diziKopyala(int[] gelenDizi) {
        int[] kopyaDizi;
        kopyaDizi = gelenDizi.clone();
        return kopyaDizi;
    }

    public static int[] diziKopyala_2(int[] gelenDizi) {
        return gelenDizi.clone();
    }

    public static int diziEKS(int[] gelenDizi) {
        int EKS = 0;
        for (int i = 0; i < gelenDizi.length; i++) {
            if (i == 0)
                EKS = gelenDizi[i];
            if (gelenDizi[i] < EKS)
                EKS = gelenDizi[i];
        }
        return EKS;
    }
}
