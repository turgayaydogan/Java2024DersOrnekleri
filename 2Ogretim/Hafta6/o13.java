import java.util.Scanner;

public class o13 {
    public static void main(String[] args) {
        // 5 kişilik bir sınıfın vize ve final not bilgisini
        // dizide nasıl saklarız?
        int[][] notlar = new int[5][2];
        Scanner giris = new Scanner(System.in);
        // veri girişi
        for (int i = 0; i < notlar.length; i++) {
            System.out.print((i + 1) + ".Vize:");
            notlar[i][0] = giris.nextInt();

            System.out.print((i + 1) + ".Final:");
            notlar[i][1] = giris.nextInt();
        }
        // ekrana yazdır
        // ekrana yazdırılma
        // satırlar
        for (int i = 0; i < notlar.length; i++) {
            // sutunlar
            for (int j = 0; j < notlar[i].length; j++) {
                System.out.print(notlar[i][j] + "\t");
            }
            System.out.println();
        }
        // her bir öğrencinin ortalaması hesaplansın ve ekrana
        // yazdırılsın
        for (int i = 0; i < notlar.length; i++) {
            // sıradaki öğrencinin ortalaması
            double ort = notlar[i][0] * 0.4 + notlar[i][1] * 0.6;
            System.out.println((i + 1) + ".Ortalama=" + ort);
        }
        // vizesi 50 den küçük öğrencilerin
        // final notlarını ekrana yazdır
        for (int i = 0; i < notlar.length; i++) {
            if (notlar[i][0] < 50)
                System.out.println(notlar[i][1]);
        }
    }
}
