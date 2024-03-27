import java.util.Random;
import java.util.Scanner;

public class o11 {
    public static void main(String[] args) {
        //dinamik dizi
        //Eleman sayısı klavyeden girilecek
        //1 boyutlu diziye 0-50 arasında rastgele değer atayınız
        //1.yöntem
        Random rnd=new Random();
        Scanner giris = new Scanner(System.in);
        int elemanSayisi=0;
        
        
        System.out.println("Eleman Sayısı:");
        elemanSayisi = giris.nextInt();
        int[] sayilar=new int[elemanSayisi];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(50);
            System.out.println(sayilar[i]);
        }
    }
}
