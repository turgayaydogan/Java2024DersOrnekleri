public class o3 {
    public static void main(String[] args) {
        topla(10,30);
        topla(10.50,50.75);
        topla(1,2,3);
        topla(10.5,20.5,5.75);
    }

    public static void topla(int sayi1,int sayi2){
        int sonuc=sayi1+sayi2;
        System.out.println(sonuc);
    }

    public static void topla(double sayi1,double sayi2){
        double sonuc=sayi1+sayi2;
        System.out.println(sonuc);
    }

    public static void topla(int sayi1,int sayi2,int sayi3){
        int sonuc=sayi1+sayi2+sayi3;
        System.out.println(sonuc);
    }

    public static void topla(double sayi1,double sayi2,double sayi3){
        double sonuc=sayi1+sayi2+sayi3;
        System.out.println(sonuc);
    }

}



