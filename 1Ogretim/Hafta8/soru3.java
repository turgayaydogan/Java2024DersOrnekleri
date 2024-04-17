import java.util.Random;

public class soru3 {
    public static void main(String[] args) {
        rastgeleSayiUret(60,70,20);
    }

    public static void rastgeleSayiUret(int baslangicDegeri, int bitisDegeri, int adet ){
        Random rnd =new Random();
        for(int i=0;i<adet;i++){
            int sayi = baslangicDegeri+ rnd.nextInt(bitisDegeri-baslangicDegeri);
            System.out.println(sayi);
        }
    }
}
