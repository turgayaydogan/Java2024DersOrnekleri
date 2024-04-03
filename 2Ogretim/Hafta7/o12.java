import java.util.Arrays;

public class o12 {
    public static void main(String[] args) {
        int[] sayilar1 = {3,5,6,2,9,7};
        
        Arrays.sort(sayilar1,2,5);

        for (int i : sayilar1) {
            System.out.println(i);
        }
    }
}
