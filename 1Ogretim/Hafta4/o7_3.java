import java.util.Random;
import java.util.Scanner;

public class o7_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner giris = new Scanner(System.in);

        int tutulanSayi;
        int tahmin;

        tutulanSayi = rnd.nextInt(101);// 0..100

        System.out.println("Bir sayı tuttum, haydi bil bakalım :)");

        do {

            System.out.println("Tahmin:");
            tahmin = giris.nextInt();

            if (tutulanSayi > tahmin)
                System.out.println("Yukarı");
            else if (tutulanSayi < tahmin)
                System.out.println("Aşağı");
            else 
                System.out.println("Tebrikler");

        } while (tahmin != tutulanSayi);
    }
}
