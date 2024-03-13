import java.util.Random;
import java.util.Scanner;

public class o8_2 {
    public static void main(String[] args) {
         Random rastgele = new Random();
        Scanner giris = new Scanner(System.in);

        int tutulanSayi;
        int tahmin;

        tutulanSayi = rastgele.nextInt(101);// 0..100

        System.out.println("Bir sayı tuttum haydi bil bakalım :)");

        do {
            System.out.println("Tahmin:");
            tahmin = giris.nextInt();

            if (tutulanSayi > tahmin)
                System.out.println("Yukarı");
            else if (tutulanSayi < tahmin)
                System.out.println("Aşağı");
            else //if (tutulanSayi == tahmin)
                System.out.println("Tebrikler");

        } while (tahmin!=tutulanSayi);
    }
}
