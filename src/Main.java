import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik sınav puanını giriniz:");
        int mat = scanner.nextInt();
        System.out.println("Fizik sınav puanını giriniz:");
        int fiz = scanner.nextInt();
        System.out.println("Kimya sınav puanını giriniz:");
        int kim = scanner.nextInt();
        System.out.println("Türkçe sınav puanını giriniz:");
        int turkce = scanner.nextInt();
        System.out.println("Tarih sınav puanını giriniz:");
        int tarih = scanner.nextInt();
        System.out.println("Müzik sınav puanını giriniz:");
        int muzik = scanner.nextInt();

        int toplam = mat + fiz + kim + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;

        System.out.println("Ortalama : " + ortalama);

        System.out.println((ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}