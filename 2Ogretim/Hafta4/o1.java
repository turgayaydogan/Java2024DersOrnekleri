import java.util.Scanner;

/**
 * o1
 */
public class o1 {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int yas, kilo, boy;
        char cinsiyet;
        double idealKilo, fark, kSabiti;

        System.out.println("Boy:");
        boy = giris.nextInt();

        System.out.println("Yaş:");
        yas = giris.nextInt();

        System.out.println("Cinsiyet:");
        cinsiyet = giris.next().charAt(0);

        System.out.println("Kilo:");
        kilo = giris.nextInt();

        if (cinsiyet == 'K')
            kSabiti = 0.8;
        else
            kSabiti = 0.9;

        idealKilo = (boy-100+yas/10)*kSabiti;

        System.out.println("İdeal Kilonuz="+idealKilo);

        if(idealKilo<kilo){
            fark = kilo-idealKilo;
            System.out.println(fark+" kilo vermelisiniz.");
        }
        if(idealKilo>kilo){
            fark = idealKilo -kilo;
            System.out.println(fark+" kilo almalısınız.");
        }
        if(idealKilo==kilo)
        System.out.println("Tebrikler, herşey yolunda :)");

    }
}