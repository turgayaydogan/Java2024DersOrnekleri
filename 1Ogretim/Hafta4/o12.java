import java.util.Scanner;

public class o12 {
    public static void main(String[] args) {
        int boy, yas;
        double kilo;
        char cinsiyet;
        double idealKilo;
        double kSabiti;
        double fark;

        Scanner giris = new Scanner(System.in);

        System.out.println("Yaş:");
        yas = giris.nextInt();

        System.out.println("Boy:");
        boy = giris.nextInt();

        System.out.println("Cinsiyet:");
        cinsiyet = giris.next().charAt(0);

        System.out.println("Kilo:");
        kilo = giris.nextDouble();

        if (cinsiyet == 'e')
            kSabiti = 0.9;
        else
            kSabiti = 0.8;

        // İdeal Kilo = ( boy–100 + yaş/10 )*K formülü
        idealKilo = (boy - 100 + yas / 10) * kSabiti;

        System.out.println("İdeal Kilonuz:" + idealKilo);

        if (idealKilo < kilo) {
            fark = kilo - idealKilo;
            System.out.println(fark + " kg vermelisiniz.");
        }
        else if (idealKilo > kilo) {
            fark = idealKilo - kilo;
            System.out.println(fark + " kg almalısınız.");
        }
        else if (idealKilo == kilo)
            System.out.println("tebrikler. ideal kilonuzdanısın");

    }
}
