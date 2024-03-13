import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        int baslangic = 0;
        int bitis = 0;
        int kalan = 0;

        Scanner giris = new Scanner(System.in);

        System.out.println("Sayı:");
        bitis = giris.nextInt();

        do {
            kalan = baslangic % 7;
            if (kalan == 0)// sıradaki sayı 7nin katıdır
                System.out.println(baslangic);

            baslangic++;

        } while (baslangic <= bitis);

    }
}
