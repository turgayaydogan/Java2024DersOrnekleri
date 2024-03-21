public class o2_3 {
    public static void main(String[] args) {
        double nufus = 77;
        double artisMiktari;

        for (int i = 1; i <= 10; i++) {
            artisMiktari = (nufus / 100) * 1.3;
            nufus = artisMiktari + nufus;
            System.out.println( i +" yıl sonra nufus = "+nufus+" milyon");
        }
    }
}
