public class o9 {
    public static void main(String[] args) {
        int[] sayilar1 = {3,5,6,2,9,7};
        int[] sayilar2;

        sayilar2 = sayilar1;

        System.out.println(sayilar1[0]);
        System.out.println(sayilar2[0]);

        sayilar2[0] = 100 ;

        System.out.println("Yeni Değerler");
        System.out.println(sayilar1[0]);
        System.out.println(sayilar2[0]);
    }
}
