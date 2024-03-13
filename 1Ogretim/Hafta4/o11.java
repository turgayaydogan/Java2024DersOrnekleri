import java.util.Scanner;

public class o11 {
    public static void main(String[] args) {
        int sayi1, sayi2, toplam;
        char secim;

        Scanner giris = new Scanner(System.in);

        do {

            System.out.println("1.Sayı:");
            sayi1 = giris.nextInt();

            System.out.println("2.Sayı:");
            sayi2 = giris.nextInt();

            toplam = sayi1 + sayi2;

            System.out.println(toplam);

            System.out.println("Tekrar hesaplama yapmak istiyormusunuz?");
            secim = giris.next().charAt(0);

        } while (secim=='e');

    }
}
