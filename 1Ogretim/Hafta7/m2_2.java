import java.util.Scanner;

public class m2_2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int sayi1,sayi2;

        System.out.println("1.Sayı:");
        sayi1=giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2=giris.nextInt();

        sayilariTopla(sayi1, sayi2);


    }

    public static void sayilariTopla(int sayi1,int sayi2){
        int toplam;
        toplam = sayi1+sayi2;
        System.out.println(toplam);
    }
}
