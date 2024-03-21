public class o2_2 {
    public static void main(String[] args) {
        double nufus = 77;//milyon demek
        double artisMiktari = 0;

        for (int i = 0; i < 10; i++) {
            artisMiktari = (nufus / 100) * 1.3;            
            nufus = artisMiktari + nufus;
            System.out.println((i+1)+ ".yıl="+nufus);
        }
    }
}
