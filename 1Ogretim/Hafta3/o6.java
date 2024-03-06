import java.util.Scanner;

public class o6 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int sayi,kalan;

        System.out.println("Sayı:");
        sayi =  giris.nextInt();

        kalan = sayi % 2;//2 bölümünden kalanı hesapla

        if(kalan==0){
            System.out.println("çift");
        }
        if(kalan==1){
            System.out.println("tek");
        }



    }
}
