public class o4 {
    public static void main(String[] args) {
        int[] sayilar1={3,5,1,9,7};
        int[] sayilar2;

        sayilar2 = sayilar1.clone();

        System.out.println("*sayilar2 dizisi değeleri*");
        for (int i = 0; i < sayilar2.length; i++) {
            System.out.println(sayilar2[i]);
        }
        System.out.println("*sayilar1 dizisi değeleri*");
        sayilar2[0]=500;
        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }
        System.out.println("sayilar2 dizinin değerleri");
        for (int herBirEleman : sayilar2) {
            System.out.println(herBirEleman);
        }
        System.out.println("sayilar2 dizinin değerleri");
        for (int i = 0; i < sayilar2.length; i++) {
            int herBirEleman = sayilar2[i];
            System.out.println(herBirEleman);
        }
    }
}
