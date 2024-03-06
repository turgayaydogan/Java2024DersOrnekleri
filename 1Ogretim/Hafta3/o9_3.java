import java.util.Scanner;

public class o9_3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int ogrNotu;

        System.out.println("Notunuz:");
        ogrNotu = giris.nextInt();

        if (0 <= ogrNotu && ogrNotu < 25)
            System.out.println("F");
        else if (25 <= ogrNotu && ogrNotu < 45)
            System.out.println("D");
        else if (45 <= ogrNotu && ogrNotu < 55)
            System.out.println("E");
        else if (55 <= ogrNotu && ogrNotu < 70)
            System.out.println("C");
        else if (70 <= ogrNotu && ogrNotu < 85)
            System.out.println("B");
        else 
            System.out.println("A");
    }
}
