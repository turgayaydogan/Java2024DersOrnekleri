import java.util.Arrays;

public class o9 {
    public static void main(String[] args) {
        int[] sayilar1={3,5,1,2,7};
        int[] sayilar2 ={3,5,10,2,7};

        boolean ayniMi = Arrays.equals(sayilar1, sayilar2);
        System.out.println(ayniMi);
    }
}
