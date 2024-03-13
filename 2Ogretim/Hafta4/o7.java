public class o7 {
    public static void main(String[] args) {
        int a, b, c;
        
        for (int i = 0; i < 10; i++) {
            a = (int) (Math.random() * 10);//0..9
            System.out.println(a);
        }
        System.out.println("*********");
        a = 50;
        b = 100;
	
        // 50.....150 arasında rastgele bir tam sayı tutmak için
        c = a + ( (int) (Math.random() * b)); // a.....(a+b)
        System.out.println(c);


    }
}
