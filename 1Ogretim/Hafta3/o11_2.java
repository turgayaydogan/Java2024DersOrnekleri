import java.util.Scanner;

public class o11_2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        String s1="Ali";
        String s2;

        System.out.println("Adınız:");

        s2 = giris.nextLine();

        //System.out.println(s2);

        if (s1.equals(s2))
            System.out.println("eşit");
        else
            System.out.println("eşit değildir");




    }
}
