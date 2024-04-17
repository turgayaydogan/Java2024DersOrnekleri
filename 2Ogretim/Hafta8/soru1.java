import java.util.Arrays;
import java.util.Random;

public class soru1 {
    public static void main(String[] args) {
        int[] sayilar=new int[50];
        Random rnd=new Random();

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(100);//0..99
            System.out.println(sayilar[i]);
        }

        System.out.println("Sıralanmış Dizi");
        diziSirala(sayilar);
    }

    public static void diziSirala(int[] gelenDizi){
        Arrays.sort(gelenDizi);
        for (int i = 0; i < gelenDizi.length; i++) {
            System.out.println(gelenDizi[i]);
        }
    }
}
