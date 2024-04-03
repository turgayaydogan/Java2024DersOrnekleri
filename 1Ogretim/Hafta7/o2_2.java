/**
 * o2_2
 */
public class o2_2 {

    public static void main(String[] args) {
        int[] sayilar = { 5, 4, 3, 9, 10, 15 };
        int eks=0;

        for (int i = 0; i < sayilar.length; i++) {
            if (i == 0)
                eks = sayilar[i];

            if (sayilar[i] < eks)
                eks = sayilar[i];
        }
        System.out.println(eks);
    }
}