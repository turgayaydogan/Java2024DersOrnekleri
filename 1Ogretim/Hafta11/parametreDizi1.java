import java.util.Arrays;
import java.util.Random;

/**
 * parametreDizi1
 */
public class parametreDizi1 {
//DİKKAT DİKKAT
//Dizileri metotlarda PARAMETRE olarak kullanırken , aman ha lütfen DİKKAT
    public static void main(String[] args) {
        int[] sayilar1=new int[10];
        int[] sayilar2;

        sayilar2=sayilar1;//Dizinin değeri değil, REFERANSI atandı,
                            // yani sayilar1 dizisi ve sayilar2 dizisi aynı oldu

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
        Arrays.sort(gelenDizi);
        for (int i = 0; i < gelenDizi.length; i++) {
            System.out.println(gelenDizi[i]);
        }
    }
}