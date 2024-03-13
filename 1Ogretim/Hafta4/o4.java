public class o4 {
    public static void main(String[] args) {
        int a, b, c;
        //System.out.println(Math.random());
        
        a = (int) (Math.random() * 10);
        System.out.println(a);
        
        a = 50;
        b = 100;

        // 50.....150 arasında rastgele bir tam sayı tutmak için
        c = a + ((int) (Math.random() * b)); // a.....(a+b)
        System.out.println(c);

    }
}
