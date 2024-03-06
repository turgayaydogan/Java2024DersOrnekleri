import java.util.Scanner;

public class o6_2 {
    public static void main(String[] args) {
        String s1 = "Ali";
        String s2 ;
        Scanner giris=new Scanner(System.in);
        System.out.println("isminiz:");
        s2 = giris.nextLine();

        if (s1.equals(s2))//String eşitlik kontrolü aynı=true farklı=false
            System.out.println("Aynı");
        else
            System.out.println("Farklı");
    }
}
