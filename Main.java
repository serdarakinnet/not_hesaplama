import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Sınav Puanı: ");
        int matPuan = scanner.nextInt();

        System.out.println("Fizik Sınav Puanı: ");
        int fizikPuan = scanner.nextInt();

        System.out.println("Kimya Sınav Puanı: ");
        int kimyaPuan = scanner.nextInt();

        System.out.println("Türkçe Sınav Puanı: ");
        int turkcePuan = scanner.nextInt();

        System.out.println("Tarih Sınav Puanı: ");
        int tarihPuan = scanner.nextInt();

        System.out.println("Müzik Sınav Puanı: ");
        int muzikPuan = scanner.nextInt();

        int ortalama = (matPuan + fizikPuan + kimyaPuan + turkcePuan + tarihPuan + muzikPuan) / 7;

        System.out.println("Ortalama: " + ortalama);

        String durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(durum);
    }
}