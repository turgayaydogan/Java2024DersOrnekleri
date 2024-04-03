import java.util.Arrays;

public class o8 {
    public static void main(String[] args) {
        int[] sayilar1={3,5,1,2,7};
        int bulunanDeger = Arrays.binarySearch(sayilar1, 8);
        System.out.println(bulunanDeger);

        bulunanDeger = Arrays.binarySearch(sayilar1, 7);
        System.out.println(bulunanDeger);
    }
}
