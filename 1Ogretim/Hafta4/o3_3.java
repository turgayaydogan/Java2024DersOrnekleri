import java.util.Scanner;

public class o3_3 {
    public static void main(String[] args) {
        int baslangic, bitis;

        Scanner giris = new Scanner(System.in);

        System.out.println("Başlangıç:");
        baslangic = giris.nextInt();

        System.out.println("Bitiş:");
        bitis = giris.nextInt();

        do {
            // sıradaki sayı 8 tam bölünür ve
            // siradaki sayı 5 tam bölünmez ise
            if ((baslangic % 8) == 0 && (baslangic % 5)!=0) {
                    System.out.println(baslangic);
            }

            //siradaki sayıyı 1 arttır ve sona s-doğru ilerle
            baslangic++;

        } while (baslangic<=bitis);//sona ulaşıp ulaşmama

    }
}
