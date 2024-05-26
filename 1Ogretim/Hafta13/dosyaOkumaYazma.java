import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class dosyaOkumaYazma {
    public static void main(String[] args) throws Exception {
        String dosyaAdi = "D:\\JavaOkul\\RastgeleVeri.txt";
        BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
        String satir = oku.readLine();
        while (satir != null) {
            String[] ogrenciBilgileri = satir.split(";");
            //ogrenciBilgileri[0] ==> No
            //ogrenciBilgileri[1] ==> Ad
            //ogrenciBilgileri[2] ==> Soyad
            //ogrenciBilgileri[5] ==> Vize
            //ogrenciBilgileri[6] ==> Final
            //ogrenciBilgileri[7] ==> GNO
            double gno = Double.parseDouble(ogrenciBilgileri[7]);
            double vizeNotu = Double.parseDouble(ogrenciBilgileri[5]);
            double finalNotu = Double.parseDouble(ogrenciBilgileri[6]);
            double ort;
            if(gno<=1.8){
                ort = vizeNotu*0.4+finalNotu*0.6;
                System.out.println(ogrenciBilgileri[1]+" "+ogrenciBilgileri[2]+" Ortalama="+ort);
            }
                
            

            satir = oku.readLine();
        }
        oku.close();

    }
}
