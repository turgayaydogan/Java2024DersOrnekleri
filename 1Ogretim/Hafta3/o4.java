import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double vizeNotu,finalNotu,ortalama;

        System.out.println("Vize:");
        vizeNotu = giris.nextDouble();

        System.out.println("Final:");
        finalNotu = giris.nextDouble();

        ortalama = vizeNotu * 0.4 + finalNotu * 0.6;

        System.out.println("Ortalamanız="+ortalama);

        if(ortalama>=70){
            System.out.println("Başarılı");
        }

        if(ortalama<70){
            System.out.println("Başarısız");
        }


    }
}
