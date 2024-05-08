import java.util.Arrays;
import java.util.Random;

public class parametreDizi3 {
        public static void main(String[] args) {
        int[] sayilar1=new int[10];

        Random rnd=new Random();
        
        for (int i = 0; i < sayilar1.length; i++) {
            sayilar1[i] = rnd.nextInt(50);//0..49
            System.out.println(sayilar1[i]);
        }

        System.out.println("Dizi Sıralama İşlemi");
        diziSirala(sayilar1);

        System.out.println("sayilar1 dizisinin değeri");

        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }
    }

    public static void diziSirala(int[] gelenDizi){
        int[] kopyaDizi = gelenDizi.clone();
        Arrays.sort(kopyaDizi);
        for (int i = 0; i < kopyaDizi.length; i++) {
            System.out.println(kopyaDizi[i]);
        }
    }
}
