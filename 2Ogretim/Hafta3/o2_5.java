import java.util.Scanner;

public class o2_5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double not1, not2;
        double ortalama;

        System.out.println("Vize:");
        not1 = giris.nextInt();

        System.out.println("Final:");
        not2 = giris.nextInt();

        ortalama = not1 * 0.4 + not2 * 0.6;

        System.out.println("Ortalamanız=" + ortalama);

        if (ortalama >= 70) 
            System.out.println("Başarılı");
        else 
            System.out.println("Başarısız");
    }
}
