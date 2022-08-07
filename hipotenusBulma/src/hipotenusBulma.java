import java.util.Scanner;

public class hipotenusBulma {
    public static void main(String[] args) {
        // Değişken Tanımlama
        int sayi1,sayi2;
        double sayi3;

        // Kullanıcıdan Veri Al
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        sayi1 = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        sayi2 = girdi.nextInt();

        sayi3 = Math.sqrt((sayi1*sayi1) + (sayi2*sayi2));
        System.out.print("Hipotenüs: "+sayi3);
    }
}
