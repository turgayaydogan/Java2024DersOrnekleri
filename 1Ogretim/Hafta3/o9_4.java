import java.util.Scanner;

public class o9_4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int ogrNotu;

        System.out.println("Notunuz:");
        ogrNotu = giris.nextInt();

        if (ogrNotu < 25)
            System.out.println("F");
        else if (ogrNotu < 45)
            System.out.println("D");
        else if (ogrNotu < 55)
            System.out.println("E");
        else if (ogrNotu < 70)
            System.out.println("C");
        else if (ogrNotu < 85)
            System.out.println("B");
        else 
            System.out.println("A");
    }
}
