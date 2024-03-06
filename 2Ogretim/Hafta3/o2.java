import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int not1,not2;
        double ortalama;
        double vizeOran,finalOran;

        System.out.println("Vize:");
        not1 = giris.nextInt();

        System.out.println("Final:");
        not2 = giris.nextInt();

        vizeOran = (not1/100.0)*40;
        finalOran = (not2/100.0)*60;

        ortalama = vizeOran + finalOran;

        System.out.println("Ortalamanız="+ortalama);

        if(ortalama>=70){
            System.out.println("Başarılı");
        }
        if(ortalama<70){
            System.out.println("Başarısız");
        }
    }
}
