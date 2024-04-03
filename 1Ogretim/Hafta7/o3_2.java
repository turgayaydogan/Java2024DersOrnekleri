/**
 * o3_2
 */
public class o3_2 {

    public static void main(String[] args) {
        int[] sayilar1={5,3,6};
        int[] sayilar2;
        sayilar2=sayilar1;
        int sayi1=5;
        int sayi2=sayi1;
        sayi2=500;

        System.out.println(sayilar1[0]);
        System.out.println(sayilar2[0]);
        System.out.println("*Dizi Değerleri*");
        sayilar2[0] = 500;
        System.out.println(sayilar2[0]);
        System.out.println(sayilar1[0]);
        System.out.println("*Değişken Değerleri*");
        System.out.println("sayi1="+sayi1);
        System.out.println("sayi2="+sayi2);
    }
}
