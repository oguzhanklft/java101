import java.util.Scanner;

public class HesapMakine {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner girdi = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = girdi.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = girdi.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = girdi.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " +(n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " +(n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " +(n1 * n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez !");
                        break;
                        default: System.out.println("Bölme: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız. Lütfen tekrar deneyiniz.");
        }
    }
}
