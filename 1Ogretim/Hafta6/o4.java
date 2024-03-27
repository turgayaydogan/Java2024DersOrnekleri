import java.util.Random;

public class o4 {
    public static void main(String[] args) {
        //10 elamanlı sayısal diziye 0..99 arasında 
        //rastgele değer ata ve ekrana yazdır

        Random rnd=new Random();
        int[] sayilar=new int[10];
        //rastgele değer ata
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(100);
        }
        //ekrana yazdır
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

    }
}
