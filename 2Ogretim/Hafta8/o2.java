import java.util.Arrays;

public class o2 {
    public static void main(String[] args) {
        int[] sayilar1={1,3,9,7,5};
        int[] sayilar2;

        sayilar2 = diziKopyala(sayilar1);//int[] gelenDizi = sayilar1 parametre listesine yollandı
    
        System.out.println(Arrays.toString(sayilar2));

        sayilar1[0] = 100;

        System.out.println("Eleman Değiştirildi");
        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));

    }
                                    
    public static int[] diziKopyala(int[] gelenDizi){
        int[] kopyaDizi;
        kopyaDizi = gelenDizi.clone();
        return kopyaDizi;
    }

    public static int[] diziKopyala2(int[] gelenDizi){
        return gelenDizi.clone();
    }
}
