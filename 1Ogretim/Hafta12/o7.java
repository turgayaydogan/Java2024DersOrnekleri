import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class o7 {
    public static void main(String[] args) throws IOException {
       
        String dosyaAdi = "D:\\ogrenciler\\ogrenciler.txt";
        FileReader fr = new FileReader(dosyaAdi);
        int sonuc = fr.read();
        while (sonuc != -1) {
            System.out.print((char) sonuc);
            sonuc = fr.read();
        }
        fr.close();

    }
}
