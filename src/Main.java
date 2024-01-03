import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik sınav puanını giriniz:");
        int matematik = scanner.nextInt();
        System.out.println("Fizik sınav puanını giriniz:");
        int fizik = scanner.nextInt();
        System.out.println("Kimya sınav puanını giriniz:");
        int kimya = scanner.nextInt();
        System.out.println("Türkçe sınav puanını giriniz:");
        int turkce = scanner.nextInt();
        System.out.println("Tarih sınav puanını giriniz:");
        int tarih = scanner.nextInt();
        System.out.println("Müzik sınav puanını giriniz:");
        int muzik = scanner.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;

        System.out.println("Sonuc : " + ortalama);

        System.out.println((ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}