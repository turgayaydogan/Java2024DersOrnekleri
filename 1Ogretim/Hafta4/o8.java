import java.util.Random;
import java.util.Scanner;

public class o8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner giris = new Scanner(System.in);

        int tutulanSayi;
        int tahmin=-1;//programın çalışmasını olumsuz etkilemeyecek değer girilmeli

        tutulanSayi = rnd.nextInt(101);// 0..100

        System.out.println("Bir sayı tuttum, haydi bil bakalım :)");

        while (tahmin != tutulanSayi) {

            System.out.println("Tahmin:");
            tahmin = giris.nextInt();

            if (tutulanSayi > tahmin)
                System.out.println("Yukarı");
            else if (tutulanSayi < tahmin)
                System.out.println("Aşağı");
            else 
                System.out.println("Tebrikler");

        } 
    }
}
