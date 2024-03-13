import java.util.Random;

public class o7_3 {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int sayi = rastgele.nextInt(100);// 0..99
        System.out.println(sayi);
        for (int i = 0; i < 10; i++) {
            sayi = rastgele.nextInt(100);// 0..99
            System.out.println(sayi);
        }

    }
}
