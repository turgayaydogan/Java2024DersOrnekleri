import java.util.Scanner;

public class o1_3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int yas, kilo, boy;
        char cinsiyet;
        double idealKilo, fark;

        System.out.println("Boy:");
        boy = giris.nextInt();

        System.out.println("Yaş:");
        yas = giris.nextInt();

        System.out.println("Cinsiyet:");
        cinsiyet = giris.next().charAt(0);

        System.out.println("Kilo:");
        kilo = giris.nextInt();

        if (cinsiyet == 'K')
            idealKilo = (boy - 100 + yas / 10.0) * 0.8;
        else
            idealKilo = (boy - 100 + yas / 10.0) * 0.9;

        System.out.println("İdeal Kilonuz=" + idealKilo);

        if (idealKilo < kilo) {
            fark = kilo - idealKilo;
            System.out.println(fark + " kilo vermelisiniz.");
        } else if (idealKilo > kilo) {
            fark = idealKilo - kilo;
            System.out.println(fark + " kilo almalısınız.");
        } else if (idealKilo == kilo)
            System.out.println("Tebrikler, herşey yolunda :)");
    }
}
