import java.util.Arrays;

public class o10 {
    public static void main(String[] args) {
        int[] sayilar1={3,5,1,2,7};
        int[] sayilar2;
        int[] sayilar3;
        sayilar2 = Arrays.copyOf(sayilar1, 2);
        for (int i : sayilar2) {
            System.out.println(i);
        }
        System.out.println("Aradan Kopyala");
        sayilar3 = Arrays.copyOfRange(sayilar1, 1, 4);
        for (int i : sayilar3) {
            System.out.println(i);
        }
    }
}
