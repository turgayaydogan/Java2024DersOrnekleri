public class kelimeBulma {
    public static void main(String[] args) {
        String str1 = "Bugün hava çok ama çok güzel";
        String[] kelimeler = str1.split(" ");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }
        System.out.println("******************");
        for (int i = 0; i < kelimeler.length; i++) {
            String kelime = kelimeler[i];
            System.out.println(kelime);
        }
    }
}
