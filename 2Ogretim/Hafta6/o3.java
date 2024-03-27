import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int[] sayilar = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Sayı Gir:");
            sayilar[i] = giris.nextInt();
        }
        System.out.println("********");
        for (int i = 0; i < 5; i++)
            System.out.println(sayilar[i]);
    }
}
