import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, total;

        // Meyve Kilogram Tutarları Tanımlandı
        double armutTutar = 2.14;
        double elmaTutar = 3.67;
        double domatesTutar = 1.11;
        double muzTutar = 0.95;
        double patlicanTutar = 5.00;

        // Kullanıcı Girdileri Alındı.
        Scanner kg = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ?:");
        armut = kg.nextDouble();

        System.out.print("Elma Kaç Kilo ?:");
        elma = kg.nextDouble();

        System.out.print("Domates Kaç Kilo ?:");
        domates = kg.nextDouble();

        System.out.print("Muz Kaç Kilo ?:");
        muz = kg.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ?:");
        patlican = kg.nextDouble();

        // Alışveriş Toplam Tutar Hesabı
        total = armut * armutTutar + elma * elmaTutar + domates * domatesTutar + muz * muzTutar + patlican * patlicanTutar;

        System.out.print("Toplam Tutar: " +total +"TL");
    }
}
