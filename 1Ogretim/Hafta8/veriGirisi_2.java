import java.util.Scanner;

public class veriGirisi_2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        double d1,d2;
        int sayi1;
        String ad;

        System.out.print("Sayısal Veri Girişi:");
        d1=giris.nextDouble();

        System.out.print("Sayısal Veri Girişi:");
        d2=giris.nextDouble();

        System.out.print("Sayısal Veri Girişi:");
        sayi1=giris.nextInt();
        //1.çözüm
        //sayısal veri girişinden sonra giris.nextLine(); yazılır
        giris.nextLine();
        System.out.print("String Veri Girişi:");
        ad=giris.nextLine();
        //Sayısal veri girişi yapıldıktan sonra 
        //sayısal karakterlerden sonraki newline özel karakteri
        // boşta kalır,
        // bu problemi gidermek için:
        // 1. sayısal veri girişinden sonra bir satırda
        // giris.nextLine() ile boşta kalan karakter okunur
        // 2. dönüşüm ile sayısal veriler okunabilir
        // ör: sayi1 = Integer.parseInt(giris.nextLine());
        // not: kaçtane sayısal veri giriş var ise hepsinde
        //      dönüşüm yapmalısınız

        System.out.println("Girilen Değerler:");
        System.out.println("d1= "+d1);
        System.out.println("d2= "+d2);
        System.out.println("sayi1= "+sayi1);
        System.out.println("ad= "+ad);


    }
}
