import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {

        // Tanımlar Yapıldı
        double kdvsizTutar,kdvYuzdesi,kdvTutari,kdvliTutar;

        // Kdvsiz Tutar Hesaplandı
        Scanner tutar = new Scanner(System.in);
        System.out.print("Tutarı Giriniz: ");
        kdvsizTutar = tutar.nextDouble();

        // Ürünün Tutarına Bağlı olarak Uygulanan KDV yüzdesi
        kdvYuzdesi = (kdvsizTutar <= 1000) ? 0.18 : 0.08;
        kdvTutari  = kdvsizTutar * kdvYuzdesi;
        kdvliTutar = kdvsizTutar + kdvTutari;

        System.out.println("Ürünün KDVsiz Tutarı: " +kdvsizTutar);
        System.out.println("Ürünün KDV Yüzdesi: " +kdvYuzdesi);
        System.out.println("Ürünün KDV Tutarı: " +(kdvliTutar - kdvsizTutar));
        System.out.println("Ürünün KDVli Tutarı: " +kdvliTutar);
    }
}
