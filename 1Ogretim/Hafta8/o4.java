public class o4 {
    public static void main(String[] args) {
        System.out.println("Sonuçlar");
        topla(50,60);
        topla(5.25,6.5);
        topla(5.25,7);//==> 7 = 7.0 

        topla(9,6,3);
        topla(8.5,6.25,8.78);
        
    }

    public static void topla(int sayi1,int sayi2){
        int sonuc = sayi1+sayi2;
        System.out.println(sonuc);
    }

    public static void topla(double sayi1,double sayi2){
        double sonuc = sayi1+sayi2;
        System.out.println(sonuc);
    }

    public static void topla(int sayi1,int sayi2,int sayi3){
        int sonuc = sayi1+sayi2+sayi3;
        System.out.println(sonuc);
    }

    public static void topla(double sayi1,double sayi2,double sayi3){
        double sonuc = sayi1+sayi2+sayi3;
        System.out.println(sonuc);
    }
}
