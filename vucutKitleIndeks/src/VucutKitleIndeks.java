import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        double boy, kilo;

        // Kullanıcıdan Verileri Alalım
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = inp.nextDouble();

        // Vücut Kitle İndeks Hesap
        double indeks = kilo/Math.pow(boy,2);

        System.out.println("Vücut kitle indeksiniz: " +indeks);
    }
}
