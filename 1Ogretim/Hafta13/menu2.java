import java.io.IOException;
import java.util.Scanner;

public class menu2 {
    public static String[][] ogrenciler = new String[50][5];

    public static void main(String[] args) {
        ogrenciler[0][0] = "Ali";
        anaMenu();
    }

    public static void anaMenu() {
        char secim = '1';
        while (secim != '3') {
            ekraniTemizle2();
            Scanner giris = new Scanner(System.in);
            System.out.println("*****ANA MENU******");
            System.out.println("[1]\tVeri Girişi");
            System.out.println("[2]\tListele");
            System.out.println("[3]\tÇıkış");
            System.out.print("Seçim:");
            ogrenciler[0][0] = "Veli";
            secim = giris.next().charAt(0);
            if (secim == '1')
                altMenu1();
            else if (secim == '2')
                altMenu2();
        }

    }

    public static void altMenu1() {
        ekraniTemizle2();

        System.out.println("*****Veri Girişi******");
        System.out.println("[1]\tMenu1");
        System.out.println("[2]\tMenu2");
        System.out.println("[3]\tÇıkış");
        System.out.print("Seçim:");
        System.out.println(ogrenciler[0][0]);

    }

    public static void altMenu2() {
        char secim = '1';
        while (secim != '4') {
            ekraniTemizle2();
            Scanner giris = new Scanner(System.in);
            System.out.println("*****Listele******");
            System.out.println("[1]\tMenu1");
            System.out.println("[2]\tMenu2");
            System.out.println("[3]\tMenu3");
            System.out.println("[4]\tÇıkış");
            System.out.print("Seçim:");
            secim = giris.next().charAt(0);
            if (secim == '1')
                altMenu2_1();
            else if (secim == '2')
                altMenu2_2();
            else if (secim == '3')
                altMenu2_3();
        }
    }

    public static void altMenu2_1() {
        System.out.println("altMenu2_1 işlemleri burada yapılır ve çıkılır");
        Scanner giris = new Scanner(System.in);
        giris.next().charAt(0);
    }

    public static void altMenu2_2() {
        System.out.println("altMenu2_2 işlemleri");
        Scanner giris = new Scanner(System.in);
        giris.next().charAt(0);
    }

    public static void altMenu2_3() {
        System.out.println("altMenu2_3 işlemleri");
        Scanner giris = new Scanner(System.in);
        giris.next().charAt(0);
    }

    public static void ekraniTemizle2() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void ekraniTemizle1() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
