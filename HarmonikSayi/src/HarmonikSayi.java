import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int number;
        double sonuc = 0.0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        number = girdi.nextInt();
        for (double i=1; i<=number; i++){
            sonuc += (1/i);
        }
        System.out.println(sonuc);
    }
}
