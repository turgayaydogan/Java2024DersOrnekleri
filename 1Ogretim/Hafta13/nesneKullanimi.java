import java.util.Scanner;

public class nesneKullanimi {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        
        Ogrenci ogr1 = new Ogrenci();

        ogr1.ad = "Turgay";
        ogr1.soyad = "AYDOĞAN";

        System.out.println(ogr1.ad);

        ogr1.ogrenciListele();
        
        //giris.next();
        //giris.nextLine();
    }
}
