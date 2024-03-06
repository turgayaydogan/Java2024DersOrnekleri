import java.util.Scanner;

public class o1_3 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int not1,not2;
        double ortalama;

        System.out.println("1.Not:");
        not1 = giris.nextInt();

        System.out.println("2.Not:");
        not2 = giris.nextInt();

        ortalama = (double)(not1 + not2) / 2;
        //double = (int + int) / int
        System.out.println("Ortalamanız="+ortalama);

        if(ortalama>=70){
            System.out.println("Başarılı");
        }
    }
}
