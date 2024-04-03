import java.io.SyncFailedException;
import java.util.Random;

public class m4 {
    public static void main(String[] args) {
        int sonuc;
        sonuc=rastgeleSayiTut();
        System.out.println(sonuc);
    }

    public static int rastgeleSayiTut(){
        Random rnd=new Random();
        int sayi;
        sayi=rnd.nextInt(101);//0..100
        return sayi;
        
    }
}
