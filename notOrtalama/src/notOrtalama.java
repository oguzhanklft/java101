import java.util.Scanner;

public class notOrtalama {
    public static void main(String[] args) {
        // Değişkenleri oluşturdum
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerler alınır
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        // Not Ortalaması Hesabı
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam/6;

        // Not Ortalamasının Yazılı Hali
        System.out.println("Ortalamanız: "+sonuc);

        // Sınıfı Geçme Durumu
        boolean kosul = sonuc >= 60;
        String sondurum = kosul ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(sondurum);
    }
}