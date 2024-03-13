/**
 * o1
 */
public class o1 {

    public static void main(String[] args) {
        int baslangic = 0;
        int kalan = 0;
        do {
            kalan = baslangic % 2;
            if (kalan == 1)
                System.out.println(baslangic);

            baslangic++;
        } while (baslangic < 100);

    }
}