import java.util.Scanner;

public class o9 {
    public static void main(String[] args) {
        int sayilar[][] = {

                { 10, 93, 41, 19, 27, 93, 63, 36, 63, 28 },
                { 10, 20, 50, 56, 28, 79, 81, 39, 33, 49 },
                { 10, 36, 58, 92, 47, 32, 74, 32, 23, 26 },
                { 10, 88, 78, 68, 65, 81, 26, 89, 23, 54 },
                { 10, 61, 41, 84, 40, 79, 79, 84, 49, 21 },
                { 10, 76, 83, 54, 55, 57, 75, 44, 11, 26 },
                { 10, 35, 77, 57, 14, 79, 37, 39, 88, 23 },
                { 10, 32, 34, 81, 81, 53, 71, 39, 62, 39 },
                { 10, 45, 20, 93, 18, 90, 98, 32, 16, 17 } };

        Scanner giris = new Scanner(System.in);
        int satirNumarasi=0;
        int toplam =0;
        System.out.println("Toplanacak Satır Numarasını Gir:");
        satirNumarasi = giris.nextInt();
        //sadece belirli bir satırın sutunları toplanacağı
        //için 1 döngü yeterlidir
        //i satirNumarasi girilen satırın sutunlarını ifade eder
        for(int i=0;i<10;i++){
            toplam += sayilar[satirNumarasi-1][i];
        }
        System.out.println("Satır Toplamı="+toplam);

    }
}
