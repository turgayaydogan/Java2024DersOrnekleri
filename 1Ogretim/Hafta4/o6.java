import java.util.Random;

public class o6 {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int a, b, c;

        a = rastgele.nextInt(50);//0..49
        System.out.println(a);
        a = 50;
        b = 100;
        c = 50 + rastgele.nextInt(100); // a.....(a+b)
        System.out.println(c);

    }
}
