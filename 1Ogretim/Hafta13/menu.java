import java.io.IOException;
import java.util.Scanner;

public class menu {
    static String[][] ogrenciler=new String[50][5];
    public static void main(String[] args) {
        ogrenciler[0][0]="Ali";
        anaMenu();
    }

    public static void anaMenu() {
        
        ekraniTemizle2();
        Scanner giris = new Scanner(System.in);
        System.out.println("*****ANA MENU******");
        System.out.println("[1]\tVeri Girişi");
        System.out.println("[2]\tListele");
        System.out.println("[3]\tÇıkış");
        System.out.print("Seçim:");
        char secim = giris.next().charAt(0);
        if (secim == '1')
            altMenu1();
        else if (secim == '2')
            altMenu2();

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
        ekraniTemizle2();
        Scanner giris = new Scanner(System.in);
        System.out.println("*****Listele******");
        System.out.println("[1]\tMenu1");
        System.out.println("[2]\tMenu2");
        System.out.println("[2]\tMenu3");
        System.out.println("[3]\tÇıkış");
        System.out.print("Seçim:");
        char secim = giris.next().charAt(0);
        if (secim == '3')
            anaMenu();
    }

    public static void ekraniTemizle1() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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
}
