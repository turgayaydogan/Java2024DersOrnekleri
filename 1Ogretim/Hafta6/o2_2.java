import java.util.Scanner;

public class o2_2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int[] sayilar1=new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Eleman değeri:");
            sayilar1[i] = giris.nextInt();
        }
        
        System.out.println("Dizinin Elemanları");
        for (int i = 0; i < 5; i++) {
            System.out.println(sayilar1[i]);
        }

        System.out.println("Dizinin Elemanların Değerinin 2 katı");
        for (int i = 0; i < 5; i++) {
            System.out.println(sayilar1[i]*2);
        }
    }
}
