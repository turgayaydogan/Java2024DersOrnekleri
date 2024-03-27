import java.util.Scanner;

public class o12 {
    public static void main(String[] args) {
        Scanner giris =new Scanner(System.in);
        int[][] notlar=new int[5][2];
        //notlar.length = satır bilgisi = öğrenci sayısı
        for (int i = 0; i < notlar.length; i++) {
            System.out.println("Vize:");
            notlar[i][0] = giris.nextInt();

            System.out.println("Final:");
            notlar[i][1] = giris.nextInt();
        }
        //ortalama hesapla
        for (int i = 0; i < notlar.length; i++) {
            //herbir öğrencinin ortalamasını hesapla
            double ort = notlar[i][0]*0.4+notlar[i][1]*0.6;
            System.out.println(ort);
        }
        //vizesi 50 den küçük olanların final notunu yazdı
        for (int i = 0; i < notlar.length; i++) {
            if(notlar[i][0]<50)
                System.out.println(notlar[i][1]);
        }


    }
}
