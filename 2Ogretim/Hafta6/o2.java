import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int[] sayilar=new int[5];

        System.out.print("Sayı Gir:");
        sayilar[0] = giris.nextInt();

        System.out.print("Sayı Gir:");
        sayilar[1] = giris.nextInt();

        System.out.print("Sayı Gir:");
        sayilar[2] = giris.nextInt();

        System.out.print("Sayı Gir:");

        sayilar[3] = giris.nextInt();

        System.out.print("Sayı Gir:");
        sayilar[4] = giris.nextInt();

        System.out.println("*************");
        System.out.println(sayilar[0]);
        System.out.println(sayilar[1]);
        System.out.println(sayilar[2]);
        System.out.println(sayilar[3]);
        System.out.println(sayilar[4]);
        

    }
}
