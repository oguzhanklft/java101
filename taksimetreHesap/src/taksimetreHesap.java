import java.util.Scanner;

public class taksimetreHesap {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total , startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total<20) ? 20 : total;
        System.out.print("Toplam Tutar: " + total);
    }
}
