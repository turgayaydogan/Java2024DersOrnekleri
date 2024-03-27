import java.util.Random;

public class o9 {
    public static void main(String[] args) {
        int[][] sayilar = new int[4][5];
        Random rnd=new Random();

        //değer atama
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                sayilar[i][j] = rnd.nextInt(100);
            }
        }
        //ekrana yazdırılma
        //satırlar
        for (int i = 0; i < sayilar.length; i++) {
            //sutunlar
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j]+"\t");
            }
            System.out.println();
        }

        

    }
}
