import java.util.ArrayList;

public class o2 {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            sayilar.add(i);
        }

        System.out.println(sayilar.size());
        System.out.println("Ekrana Yazdırma 1");
        //Kullanım şekline dikkat edelim
        for (Integer i : sayilar)
            System.out.println(i + " ");

        System.out.println("Ekrana Yazdırma 2");
        //Kullanım şekline dikkat edelim
        for (Integer i : sayilar)
            System.out.println(i + " ");

        int birinciSayi = sayilar.get(0);//index numarasınd göre elemanı alma
        System.out.println(birinciSayi);

        System.out.println(sayilar.get(2));//listenin 3.elemanı

    }
}
