import java.io.File;

public class o4 {
    public static void main(String[] args) {
        File file = new File("d:\\ogrenciler\\Yeni");
        if (!file.exists())
            file.mkdirs();

        klasorOlustur();
    }

    public static void klasorOlustur(){
        String yol ="D:\\ogrenciler\\";
        int adet = 1;
        for (int i = 0; i < 20; i++) {
            String yeniKlasor = yol+adet;
            adet++;
            File file = new File(yeniKlasor);
            if (!file.exists())
                file.mkdir();

        }
    }
}
