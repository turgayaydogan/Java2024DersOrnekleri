import java.util.Random;
import java.util.Scanner;

public class o7 {
    public static void main(String[] args) {
        //Dinamik Dizi
        //her çalıştığında eleman sayısı farklı olan dizi
        Scanner giris=new Scanner(System.in);
        Random rnd = new Random();
        int elemanSayisi=0;
        
        
        System.out.println("Eleman Sayısı Gir:");
        elemanSayisi = giris.nextInt();
        int[] sayilar=new int[elemanSayisi];
        
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(100);
            System.out.println(sayilar[i]);
        }


    }
}
