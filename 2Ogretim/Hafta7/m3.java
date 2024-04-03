/**
 * m3
 */
public class m3 {

    public static void main(String[] args) {
        int sonuc = ikiSayiyiTopla(50,90);
        System.out.println(sonuc);

        ikiSayiyiTopla(50,90);

        //Math.sqrt(...) parametresli olan ve geriye değer döndüren bir metot
        double deger = Math.sqrt(25);
        System.out.println(deger);
    }

    public static int ikiSayiyiTopla(int sayi1,int sayi2){
        int toplam;
        toplam = sayi1 + sayi2;
        return toplam;
    }
}