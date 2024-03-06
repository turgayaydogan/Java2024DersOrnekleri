import java.util.Scanner;

public class o7 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int sayi,kalan;

        System.out.println("Sayı:");
        sayi =  giris.nextInt();

        kalan = sayi % 2;//2 bölümünden kalanı hesapla

        if(kalan==0)
            System.out.println("çift");
        else
            System.out.println("tek");
        
    }
}
