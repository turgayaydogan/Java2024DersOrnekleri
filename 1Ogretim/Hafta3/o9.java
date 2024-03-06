import java.util.Scanner;

public class o9 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int ogrNotu;

        System.out.println("Notunuz:");
        ogrNotu = giris.nextInt();

        if (0 <= ogrNotu && ogrNotu < 25)
            System.out.println("F");
        if (25 <= ogrNotu && ogrNotu < 45)
            System.out.println("D");
        if (45 <= ogrNotu && ogrNotu < 55)
            System.out.println("E");
        if (55 <= ogrNotu && ogrNotu < 70)
            System.out.println("C");
        if (70 <= ogrNotu && ogrNotu < 85)
            System.out.println("B");
        if (85 <= ogrNotu && ogrNotu < 101)
            System.out.println("A");

    }
}
