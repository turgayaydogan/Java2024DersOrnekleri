import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int[] sayilar1=new int[5];

        System.out.println("Eleman değeri:");
        sayilar1[0] = giris.nextInt();

        System.out.println("Eleman değeri:");
        sayilar1[1] = giris.nextInt();

        System.out.println("Eleman değeri:");
        sayilar1[2] = giris.nextInt();

        System.out.println("Eleman değeri:");
        sayilar1[3] = giris.nextInt();

        System.out.println("Eleman değeri:");
        sayilar1[4] = giris.nextInt();
        
        System.out.println("Dizinin Elamanları");
        System.out.println(sayilar1[0]);
        System.out.println(sayilar1[1]);
        System.out.println(sayilar1[2]);
        System.out.println(sayilar1[3]);
        System.out.println(sayilar1[4]);


    }
}
