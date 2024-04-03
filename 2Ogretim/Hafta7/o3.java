public class o3 {
    public static void main(String[] args) {
        double toplam =0;
        double a,m,n,z;
        z=5;
        a=2;
        m=10;
        for(n=1;n<=m;n++){
            toplam =  toplam + (a/n)*Math.pow(z-a, n);
        }
        System.out.println(toplam);
    }
}
