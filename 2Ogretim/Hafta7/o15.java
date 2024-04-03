import java.util.Arrays;

public class o15 {
    public static void main(String[] args) {
        int[] sayilar1 = {3,5,6,2,9,7};
        int[] sayilar2;

        sayilar2 = Arrays.copyOf(sayilar1, 5);
        for (int i : sayilar2) {
            System.out.println(i);
        }
        System.out.println("***********");
        int[] sayilar3;

        sayilar3 = Arrays.copyOfRange(sayilar1, 2,5);
        for (int i : sayilar3) {
            System.out.println(i);
        }
    }
}
