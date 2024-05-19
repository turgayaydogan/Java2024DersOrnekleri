import java.io.File;

public class o5 {
    public static void main(String[] args) {
        File file = new File("d:\\ogrenciler\\ogrenciler0.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getName());

        System.out.println("**********");

        File file2 = new File("d:\\ogrenciler");
        String[] liste1=file2.list();
        for (String string : liste1) {
            System.out.println(string);
        }


    }
}
