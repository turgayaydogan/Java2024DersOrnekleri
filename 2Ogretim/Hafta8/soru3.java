import java.util.Random;

public class soru3 {
    public static void main(String[] args) {
        //60..80 
        rastgeleSayiUret(60, 80, 50);
    }
    public static void rastgeleSayiUret(int baslangicDegeri, int bitisDegeri, int adet) {
        Random rnd=new Random();
        int sayi;
        for(int i=0;i<adet;i++){
            sayi = baslangicDegeri + rnd.nextInt(bitisDegeri-baslangicDegeri);
            System.out.println(sayi);
        }
    }
}
