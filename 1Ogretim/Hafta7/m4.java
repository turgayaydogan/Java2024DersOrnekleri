import java.util.Random;

public class m4 {
    
    public static void main(String[] args) {
        int sonuc;
        sonuc = rastgeleSayiTut();//sonuc=sayi;
        System.out.println(sonuc);
        System.out.println("*****");
        for (int i = 0; i < 10; i++) {
            System.out.println(rastgeleSayiTut());
        }
    }

    public static int rastgeleSayiTut(){
        Random rnd=new Random();
        int sayi;
        sayi = rnd.nextInt(101);
        return sayi;
    }
}
