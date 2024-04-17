import java.util.Scanner;

/**
 * o1
 */
public class o1 {

    public static void main(String[] args) {
        int sonuc;
        sonuc = enBuyukSayi();
        System.out.println(sonuc);
    }

    public static int enBuyukSayi(){
        Scanner giris =new Scanner(System.in);

        int sayi;
        int enBS = 0;

        for(int i=0;i<10;i++){
            System.out.println("Sayı Gir:");
            sayi = giris.nextInt();

            if(i==0)
                enBS = sayi;

            if(sayi>enBS)
                enBS = sayi;
        }

        return enBS;

    }
}