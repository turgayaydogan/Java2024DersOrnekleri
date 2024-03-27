import java.util.Random;
import java.util.Scanner;

/**
 * o11_2
 */
public class o11_2 {

    public static void main(String[] args) {
        //dinamik dizi
        //Eleman sayısı klavyeden girilecek
        //1 boyutlu diziye 0-50 arasında rastgele değer atayınız
        //2.yöntem
        Random rnd=new Random();
        Scanner giris = new Scanner(System.in);
        int elemanSayisi=0;
        int[] sayilar;
        
        System.out.println("Eleman Sayısı:");
        elemanSayisi = giris.nextInt();
        sayilar=new int[elemanSayisi];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(50);
            System.out.println(sayilar[i]);
        }
    }
}