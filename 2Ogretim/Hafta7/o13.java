import java.util.Arrays;

public class o13 {
    public static void main(String[] args) {
        int[] sayilar1 = {3,5,6,2,9,7};
        int bulunanIndex = Arrays.binarySearch(sayilar1, 5);
        System.out.println(bulunanIndex);   
    }
}
