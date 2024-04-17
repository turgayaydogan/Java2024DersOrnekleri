import java.util.Scanner;

public class veriGirisi_1 {
    public static void main(String[] args) {
        //giris.next() kullanılır ise

        Scanner giris = new Scanner(System.in);

        double d1, d2;
        int sayi1;
        String ad;

        System.out.print("Sayısal Veri Girişi:");
        d1 = giris.nextDouble();

        System.out.print("Sayısal Veri Girişi:");
        d2 = giris.nextDouble();

        System.out.print("Sayısal Veri Girişi:");
        sayi1 = giris.nextInt();

        System.out.print("String Veri Girişi:");
        ad = giris.next();

        System.out.println("Girilen Değerler:");
        System.out.println("d1= " + d1);
        System.out.println("d2= " + d2);
        System.out.println("sayi1= " + sayi1);
        System.out.println("ad= " + ad);

    }
}
