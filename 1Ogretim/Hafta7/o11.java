import java.util.Arrays;

public class o11 {
    public static void main(String[] args) {
        int[] sayilar = new int[10];
        Arrays.fill(sayilar, -1);
        for (int i : sayilar) {
            System.out.println(i);
        }
        System.out.println("Dizi Yazdırma");
        System.out.println(Arrays.toString(sayilar));
    }
}
