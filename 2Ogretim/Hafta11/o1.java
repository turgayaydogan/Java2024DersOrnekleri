import java.util.Arrays;
import java.util.Random;

/**
 * o1
 */
public class o1 {

    public static void main(String[] args) {
        int[] sayilar1=new int[10];
        Random rnd=new Random();

        for (int i = 0; i < sayilar1.length; i++) {
            sayilar1[i] = rnd.nextInt(50);//0..49
            System.out.println(sayilar1[i]);
        }
        System.out.println("Dizi Sırala");
        //diziSirala2(sayilar1);
        diziSirala(sayilar1.clone());

        System.out.println("sayilar1 dizisi");
        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }
    }

    public static void diziSirala(int[] gelenDizi){
        Arrays.sort(gelenDizi);
        for (int i : gelenDizi) {
            System.out.println(i);
        }
    }

    public static void diziSirala2(int[] gelenDizi){
        int[] yedekDizi = gelenDizi.clone();
        Arrays.sort(yedekDizi);
        for (int i : yedekDizi) {
            System.out.println(i);
        }
    }

}