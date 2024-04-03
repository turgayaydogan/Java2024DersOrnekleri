import java.util.Arrays;

public class o16 {
    public static void main(String[] args) {
        int[] sayilar=new int[10];

        Arrays.fill(sayilar, 5);
        for (int i : sayilar) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(sayilar));
        // Arrays.toString(sayilar) = [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
    }
}
