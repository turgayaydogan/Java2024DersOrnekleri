public class o4 {
    public static void main(String[] args) {
        int[] sayilar = {1,5,9,3,7};
        System.out.println("1 *****");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        System.out.println("2 *****");
        for (int i = 0; i < sayilar.length; i++) {
            int sayi = sayilar[i];
            System.out.println(sayi);
        }
        System.out.println("3 *****");
        //dizinin elemanlarını sadece okumak istediğimizde
        //kısa kod yazmak için bunu kullanabiliriz
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }

    }
}
