import java.util.Scanner;

public class o4_3 {
    public static void main(String[] args) {
        //bir haftaya ait sıcaklık veri girişi yapılacak
        //dizide olack
        //haftanın ortalamasını bul

        Scanner giris=new Scanner(System.in);
        int[] sicaklik=new int[7];
        double toplam =0;
        double ortalama;

        System.out.println("Sıcaklık Veri Girişi");
        //sicaklik.length = uzunluk = eleman sayısı = satır sayısı
        //veri girişi ve toplam bulma
        for(int i=0;i<sicaklik.length;i++){
            System.out.print((i+1)+".Gün Sıcaklık:");
            sicaklik[i] = giris.nextInt();
            toplam += sicaklik[i];
        }
        
        ortalama = toplam / 7;
        System.out.println("Sıcaklık Ortalaması="+ortalama);
    }
}