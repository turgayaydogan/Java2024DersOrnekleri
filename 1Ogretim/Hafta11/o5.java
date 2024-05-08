public class o5 {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "b";
        String str3 = "A";
        int sonuc1 = str1.compareToIgnoreCase(str2);
        int sonuc2 = str1.compareToIgnoreCase(str3);
        int sonuc3 = str2.compareToIgnoreCase(str1);
        int sonuc4 = str1.compareTo(str3);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
        System.out.println((byte) 'a');
        System.out.println((byte) 'A');
    }
}
