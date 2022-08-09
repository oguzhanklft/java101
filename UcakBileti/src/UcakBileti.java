import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km,age,travelType;
        double price,discount,discountPrice,roundTrip;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi 'KM' türünden giriniz: ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1=> Tek Yön, 2=> Gidiş Dönüş): ");
        travelType = inp.nextInt();

        // KM başına ücret
        price = km * 0.10;

        // Mesafe ve yaş pozitif, yolculuk tipi 1 ve 2 olmalı
        if(km<0 || age<0 || (travelType !=1 && travelType !=2))
            System.out.println("Hatalı değer girdiniz, lütfen tekrar deneyiniz.");

        // İndirim Uygulanması
        if(age<12) {
            discount = price * 0.50;
            discountPrice = price - discount;
        } else if(age<=24) {
            discount = price * 0.10;
            discountPrice = price - discount;
        } else if(age>=65) {
            discount = price * 0.30;
            discountPrice = price - discount;
        } else {
            discountPrice = price;
        }
        // Yolculuk tipine göre indirim uygulanması
        if(travelType == 2) {
            roundTrip = discountPrice - (discountPrice * 0.20);
            System.out.println("Toplam tutar: " + roundTrip * 2);
        } else if(travelType == 1){
            System.out.println("Toplam tutar: "+ discountPrice);
        }
    }
}
