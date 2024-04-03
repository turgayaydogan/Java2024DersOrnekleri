import java.util.Arrays;

public class o7 {
    public static void main(String[] args) {
        int[] sayilar1={3,5,1,2,7};
        Arrays.sort(sayilar1,1,4);
        for (int i : sayilar1) {
            System.out.println(i);
        }
    }
}
