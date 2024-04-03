import java.util.Arrays;

public class o11 {
    public static void main(String[] args) {
        int[] sayilar1 = {3,5,6,2,9,7};
        
        Arrays.sort(sayilar1);

        for (int i : sayilar1) {
            System.out.println(i);
        }
        System.out.println("En Küçük Değer="+sayilar1[0]);
        System.out.println("En Büyük Değer="+sayilar1[sayilar1.length-1]);
    }
}
