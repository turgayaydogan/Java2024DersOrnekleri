public class o7 {
    public static void main(String[] args) {
        String str1 = " SDU  Ceng ";
        String str2 = str1.replaceAll("  ", " ");
        System.out.println(str2);
        System.out.println(str1.length());
        System.out.println(str2.length());

        System.out.println(str1.replaceAll("  ", " ").trim());
        System.out.println(str1.replaceAll("  ", " ").trim().length());
    }
}
