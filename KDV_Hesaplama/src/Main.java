import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("KDV'siz Fiyat: ");
        double kdvsizFiyat = scanner.nextDouble();

        double kdvOrani = kdvsizFiyat >= 1000 ? 0.08 : 0.18;
        double kdvliFiyat = kdvsizFiyat * (1 + kdvOrani);
        double kdvTutari = kdvliFiyat - kdvsizFiyat;

        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);
    }
}