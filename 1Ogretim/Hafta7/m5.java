import java.util.Scanner;

public class m5 {
    public static void main(String[] args) {
        soru1();
    }

    public static void soru1() {
        Scanner giris = new Scanner(System.in);
        int sayi1, sayi2;
        int kalan;

        System.out.println("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2 = giris.nextInt();

        for (int i = sayi1; i <= sayi2; i++) {
            kalan = i % 5;
            if (kalan == 0)
                System.out.println(i);
        }
    }
}
