import java.util.Arrays;

public class soru4 {
    public static void main(String[] args) {
        int[] sayilar = {1,3,9,7,5,15,20};
        int[] sayilar2;

        System.out.println(Arrays.toString(sayilar));

        System.out.println("TEST");
        sayilar2 = yerDegistir(sayilar, 1, 4);
        System.out.println(Arrays.toString(sayilar2));
    }

    public static int[] yerDegistir(int[] gelenDizi,int ilkIndex,int ikinciIndex){
        int yedek;
        yedek = gelenDizi[ilkIndex];
        gelenDizi[ilkIndex] = gelenDizi[ikinciIndex];
        gelenDizi[ikinciIndex] = yedek;

        return gelenDizi;
    }
}
