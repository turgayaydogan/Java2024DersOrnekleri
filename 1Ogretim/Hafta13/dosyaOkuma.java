import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class dosyaOkuma {
    public static void main(String[] args) throws Exception {
        String dosyaAdi="D:\\JavaOkul\\RastgeleVeri.txt";
        
        BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
        String satir = oku.readLine();
        while (satir != null) {
            String[] ogrenciBilgileri = satir.split(";");
//1;Birgül;Beyazkaya;0594 655 66 27;1;70;53;2.81;K
            String ad = ogrenciBilgileri[1];
            String soyAd = ogrenciBilgileri[2];
            double vizeNotu = Double.parseDouble(ogrenciBilgileri[5]);
            double finalNotu = Double.parseDouble(ogrenciBilgileri[6]);
            double gno = Double.parseDouble(ogrenciBilgileri[7]);
            double ort=0;
            if(gno<=1.8){
                ort = vizeNotu*0.4+finalNotu*0.6;
                System.out.println(ad+" "+soyAd+" Ort:"+ort);
            }

           satir = oku.readLine();
        }
        oku.close();

    }
}
