import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class o3 {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<Integer>();
        Random rnd=new Random();

        for (int i = 0; i < 10; i++) {
            sayilar.add(rnd.nextInt(100));
        }
        System.out.println("Liste Elemanları");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }

        //sayilar.clear(); //listeyi temizler, elemanların hepsini siler
        System.out.println(sayilar.size());

        sayilar.remove(5);//index numarası verileni silmek için
        System.out.println("Liste Elemanları");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
        sayilar.set(0, 500);//verilen indexi değiştirme
        System.out.println("Liste Elemanları");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }

        sayilar.add(1, 1000);//araya ekleme
        System.out.println("Liste Elemanları");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }

    }
}
